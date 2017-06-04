package basic.vii_functional_programming

/**
 * High order functions
 */

// this is a higher order function as it takes a function as it's input
fun operation(num1: Int,
              num2: Int = 3, // default value for operation
              op: (Int, Int) -> Int)
        : Int {
    return op(num1, num2)
}

fun sum(num1: Int, num2: Int) = num1 + num2

fun sum(num1: Int, ho: (Int, Int, op: (Int, Int) -> Int) -> Int): Int {
    return ho(num1, num1, ::sum)
}

fun route(path: String, vararg actions: (String, String) -> Unit) {
}

fun main(args: Array<String>) {
    println(operation(1, 3, ::sum)) // We can refer to a function by it's name using ::
    println(operation(1, op = ::sum))
    println(operation(1, 3, { x, y -> x + y }))
    println()
}
