package com.motycka.edu.lesson03.model

/*
 Implement Square class that extends the Rectangle class.

    - It should have a constructor that takes one parameter for the side length.
    - It should override all methods from Rectangle class.
    - It should have a method to convert it to a 3D Cuboid with the same side length for width, height, and depth.-
 */
<<<<<<< HEAD


class Square(private val side: Double): Rectangle(side, side) {

//    private val sideLength = side

//    // Override Rectangle's properties for clarity
//    override val width: Double
//        get() = sideLength
//
//    override val length: Double
//        get() = sideLength

    // Shape2D overrides
    override fun area(): Double =
        side * side

    override fun perimeter(): Double =
        4 * side

    override fun to3D(depth: Double): Shape3D =
        Cuboid(side, side, depth)


    fun to3D(): Shape3D =
        Cuboid(side, side, side)

}
=======
>>>>>>> 49f228850e191f7fda9ad040e26fb9deeff8b9cb
