package com.motycka.edu.lesson03.model

<<<<<<< HEAD
import kotlin.math.PI
=======
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb
import kotlin.math.pow

/*
 Implement Sphere class that implements Shape3D interface.
    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape3D interface.
 */
<<<<<<< HEAD


class Sphere (private val radius: Double): Shape3D {
    override fun volume(): Double = 4.0 / 3.0 * PI * radius * radius * radius
    override fun surfaceArea(): Double  = 4 / 3 * PI * radius.pow(2)
}
=======
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb
