package basic

/**
 * Variables/Basics
 */

// Kotlin is not immutable by default
// no explicit type conversion

// Use `val` to declare a immutable value (or constant)
// Use `var` to declare mutable value
fun main(arg: Array<String>) {
    val hello = "Hello world"

    val myInt = 0
    val myLong = 10L
    val myFloat = 10F

    val myAnotherInt = 100
    val myLongFromInt = myInt.toLong()

    val escapeString = "Hello \n World"
    val multiLineString = """ This is my
  multiple line string """

    println("I am saying $escapeString") // Using $ we can do string interpolation

    val name = "Rachit"
    println("Length of my name is ${name.length}".snackCase())
}
