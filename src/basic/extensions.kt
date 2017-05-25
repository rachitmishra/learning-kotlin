package basic

/**
 * Extensions
 */

fun String.snackCase() : String {
    return this.split(" ").joinToString("_")
}

fun main(args: Array<String>) {
    val myString = "Ramesh Mohan"
    println(myString.snackCase())

    val myMango = basic.Mango()
    myMango.bestInClass(" with parameter") // If extension function and member function have same name, member function takes preference

    val instance: basic.BaseClass = basic.InheritedClass()
    instance.extendedFunction() // Will call from base class as extension functions are statically resolved
}

class Mango {
    fun bestInClass() {
        println("Default function")
    }
}

fun basic.Mango.bestInClass(message: String) {
    bestInClass()
    println("Extended function" + message)
}

// Extension functions are statically resolved

open class BaseClass

class InheritedClass: basic.BaseClass()

fun basic.BaseClass.extendedFunction() {
    println("Extended in base class")
}


fun basic.InheritedClass.extendedFunction() {
    println("Extended in inherited class")
}
