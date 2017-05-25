package basic

/**
 * High order functions
 */

// this is a higher order function as it takes a function as it's input
fun operation(num1: Int, num2: Int, op: (Int, Int) -> Int) : Int{
    return op(num1, num2)
}

fun sum(num1:Int, num2:Int) = num1 + num2

fun sum(num1: Int, ho: (Int, Int, op:(Int, Int) -> Int) -> Int) : Int {
    return ho(num1, num1, ::sum)
}

fun main(args: Array<String>) {
    println(basic.operation(1, 3, ::sum))
    println(basic.operation(1, 3, { x, y -> x + y }))
}
