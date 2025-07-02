package com.motycka.edu.lesson02


fun evaluate(a: Double, b: Double) {

<<<<<<< HEAD
    val sum = a + b
    val difference = a - b
    val product = a*b

    val isEqual = a == b
    val isNotEqual = a != b
    val aIsGreater = a > b
    val aIsLessOrEqual = a <= b

    val bothIsAboveZero = a > 0 && b > 0
    val eitherIsAboveOrEqualZero = a > 0 || b > 0
=======
    val sum = TODO()
    val difference = TODO()
    val product = TODO()

    val isEqual = TODO()
    val isNotEqual = TODO()
    val aIsGreater = TODO()
    val aIsLessOrEqual = TODO()

    val bothIsAboveZero = TODO()
    val eitherIsAboveOrEqualZero = TODO()
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Is Equal: $isEqual")
    println("Is Not Equal: $isNotEqual")
    println("A is Greater: $aIsGreater")
    println("A is Less or Equal: $aIsLessOrEqual")
    println("Both are above zero: $bothIsAboveZero")
    println("Either is above or equal to zero: $eitherIsAboveOrEqualZero")
}

fun main() {
    evaluate(2.4, 3.6)
}
