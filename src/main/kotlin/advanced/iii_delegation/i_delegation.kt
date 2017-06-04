package advanced.iii_delegation

/**
 * Delegation - One class can use composition function from two different classes
 * This can happen by injection
 */

class Rectangle(val width: Int, val height: Int) {
    fun area() = width * height
}

class Window(val rectangle: Rectangle) {
    
    // delegation
    fun area() = rectangle.area()
}


fun main(args: Array<String>) {
}
