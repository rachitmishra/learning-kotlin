package advanced.iii_delegation

/**
 * Delegates
 */

class Rectangle(val width: Int, val height: Int) {
    fun area() = width * height
}

class Window(val rectangle: Rectangle) {
    
    // delegating
    fun area() = rectangle.area()
}


fun main(args: Array<String>) {
}
