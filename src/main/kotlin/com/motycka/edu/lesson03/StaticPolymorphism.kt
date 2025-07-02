package com.motycka.edu.lesson03

<<<<<<< HEAD
import kotlin.math.PI


object AreaCalculator {

    fun calculateRectangleArea(a: Double, b: Double): Double = a * b
    fun calculateRectangleArea(a: Int, b: Int): Double = a.toDouble() * b.toDouble()


    fun calculateCircleArea(r: Double): Double {
        return PI * r * r
    }

    fun calculateCircleArea(r: Int): Double {
        return PI * r * r
    }


    fun calculateTriangleArea(a: Double, b: Double): Double = (a * b) / 2.0
    fun calculateTriangleArea(a: Int, b: Int): Double  =  (a.toDouble() * b.toDouble()) / 2.0

}
=======
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb

/*
 Implement an object called AreaCalculator with the following methods:
 - fun calculateRectangleArea(a: Double, b: Double): Double
 - fun calculateRectangleArea(a: Int, b: Int): Double
 - fun calculateCircleArea(r: Double): Double
 - fun calculateCircleArea(r: Int): Double
 - fun calculateTriangleArea(a: Double, b: Double): Double
 - fun calculateTriangleArea(a: Int, b: Int): Double

 The class demonstrates static polymorphism by providing multiple methods with the same name but different parameter types (Int and Double).
 The check will tolerate 0.001 inaccuracy.
 */

<<<<<<< HEAD

=======
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb
/*
 Uncomment the main function to try the solution.
 */

<<<<<<< HEAD
fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
}
=======
//fun main() {
//    println(AreaCalculator.calculateRectangleArea(5, 10))
//}
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb
