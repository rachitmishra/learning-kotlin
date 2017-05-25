package basic

/**
 *  Abstract classes
 */

abstract class Datson { // `abstract` class provides us with default implementations and abstract members
    var status = true
    abstract fun go()
    fun status(): Boolean {
        return status
    }
}

class Car : basic.Datson() {
    override fun go() {
        println("Let's go")
    }
}

fun main(arg: Array<String>) {
    val car = basic.Car()
    println(car.status())
}
