package basic.iv_inheritance

/**
 *  Abstract classes
 */

abstract class Datson { // `abstract` class provides us with default implementations and abstract members
    val status = true
    abstract fun go()
    fun status(): Boolean {
        return status
    }
}

class Car : Datson() {
    override fun go() {
        println("Let's go")
    }
}

fun main(arg: Array<String>) {
    val car = Car()
    println(car.status())
}
