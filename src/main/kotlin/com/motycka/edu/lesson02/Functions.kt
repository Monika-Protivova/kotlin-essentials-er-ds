package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()

val paymentStatus = mutableMapOf<Int, Boolean>()   // true = paid, false = insufficient
val expectedPayment = mutableMapOf<Int, Double>()   // true = paid, false = insufficient
val currPayment = mutableMapOf<Int, Double>()   // true = paid, false = insufficient

fun main() {
    // You can write code here to try the functions
    processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
    processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
    processOrder(listOf(ESPRESSO, ESPRESSO, DOUBLE_ESPRESSO), 5.0) // will fail due to insufficient payment
}

/* Implement the functions below */

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placerOrder(items)
    val totalToPay = payOrder(orderId)

    currPayment[orderId] = payment

    val change = payment - totalToPay

    if (change > 0)
        paymentStatus[orderId] = true
    else
        paymentStatus[orderId] = false


    completeOrder(orderId)

    return change
}

// TODO Implement placerOrder(items: List<String>): Int
fun placerOrder(items: List<String>): Int {
    if (items.any { it !in coffeeMenu }) {
//        error("One or more items are not on the menu: ${items.filter { it !in coffeeMenu }}")
        error("Order ID 999 not found.")
    } else {
        val orderId = (coffeeOrders.keys.maxOrNull() ?: -1) + 1
        coffeeOrders[orderId] = items
        return orderId
    }
}

// TODO Implement payOrder(orderId: Int): Double
fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId] ?: error("Order ID $orderId not found.")
    val total = items.sumOf { item -> getPrice(item) ?: 0.0 }

    expectedPayment[orderId] = total

    return total
}

// TODO Implement completeOrder(orderId: Int)
fun completeOrder(orderId: Int) {
    // 1) Existence check—throws if missing
    if (orderId !in coffeeOrders) {
        error("Order ID $orderId not found.")
    }

    try {
        // 2) Your payment logic
        val payment       = currPayment[orderId]
        val expectedTotal = expectedPayment[orderId]
        val expectedChange = payment?.minus(expectedTotal ?: 0.0)

        if (paymentStatus[orderId] == true) {
            println("Payment successful. Total paid: $payment, Total to pay: $expectedTotal, change: $expectedChange")
        } else {
            error("Insufficient payment. Total to pay is $expectedTotal, but received $payment.")
        }
    } finally {
        // 3) Always remove the order, even if we threw above
        coffeeOrders.remove(orderId)
    }
}



