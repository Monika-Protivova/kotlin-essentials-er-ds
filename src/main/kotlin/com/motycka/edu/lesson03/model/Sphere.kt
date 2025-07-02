package com.motycka.edu.lesson03.model

import kotlin.math.PI
import kotlin.math.pow

/*
 Implement Sphere class that implements Shape3D interface.
    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape3D interface.
 */


class Sphere (private val radius: Double): Shape3D {
    override fun volume(): Double = 4.0 / 3.0 * PI * radius * radius * radius
    override fun surfaceArea(): Double  = 4 / 3 * PI * radius.pow(2)
}
