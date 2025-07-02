package com.motycka.edu.lesson02

/*
Define String variables for two types of coffee: espresso and cappuccino.
 */
const val espresso = "Espresso"
const val cappuccino = "Cappuccino"

/*
Define Double variables for the prices of espresso and cappuccino.
 */
<<<<<<< HEAD
val espressoPrice = 2.5
val cappuccinoPrice = 3.0

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {

//    val espressoPrice   = getPrice(espresso)   ?: 0.0
//    val cappuccinoPrice   = getPrice(cappuccino)   ?: 0.0

    val totalPrice: Double = (espressoPrice * espressoQuantity)  +  (cappuccinoPrice * cappuccinoQuantity)
=======
val espressoPrice = null
val cappuccinoPrice = null

fun variables(espressoQuantity: Int, cappuccinoQuantity: Int) {

    val totalPrice: Double = TODO()
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb

    println(totalPrice)
}


fun main(args: Array<String>) {

    val espressoQuantity = args.count { it == espresso }
    val cappuccinoQuantity = args.count { it == cappuccino }

    variables(espressoQuantity = espressoQuantity, cappuccinoQuantity = cappuccinoQuantity)
}
