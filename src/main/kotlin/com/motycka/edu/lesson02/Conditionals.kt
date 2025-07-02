package com.motycka.edu.lesson02


const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2


val priceMenu: Map<String, Double> = mapOf(
    ESPRESSO to ESPRESSO_PRICE,
    DOUBLE_ESPRESSO to DOUBLE_ESPRESSO_PRICE,
    CAPPUCCINO to CAPPUCCINO_PRICE,
    LATTE to LATTE_PRICE,
    AMERICANO to AMERICANO_PRICE,
    FLAT_WHITE to FLAT_WHITE_PRICE
)

fun getPrice(item: String): Double? = priceMenu[item]

//fun getLowestPrice(): Double? = priceMenu.minOf { item -> item.value }
fun getCheapestPrice(items: List<String>): Double? = items.mapNotNull { getPrice(it) }.minOrNull()


/*
    1. Get price based on item names
    2. Get the lowest price from a list of prices
    3. Calculate a total price for a list of items
    4. Calculate a discount if 4 or more items are ordered (the cheapest item is free)
    5. Print the total price with a discount applied for each order
 */
fun conditionals() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    coffeeOrders.forEach { orderId, items ->

        println("Processing Order ID: $orderId")
        println("Items: $items")

        var total: Double = items.sumOf { item -> getPrice(item) ?: 0.0 }

        val cnt = items.count()

        // 4. if 3+ items, cheapest is free
        if (items.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
            total -= getCheapestPrice(items) ?: 0.0
        }

        println("Total price for Order ID $orderId: $total\n")

    }
}


fun main() {
    conditionals()
}
