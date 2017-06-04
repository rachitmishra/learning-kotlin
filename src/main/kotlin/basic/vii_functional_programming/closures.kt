package basic.vii_functional_programming

/**
 * Closures
 */

fun myFunction3() {
    val myNum = 3
    unaryOp(5, { x -> x * myNum }) // Lambda function able to access myNum, AKA closure

    for (num in 1..10) {
        unaryOp(5, { x ->
            println(num)
            x * num // inside a loop closure always uses new value
            }
        )
    }
}

fun main(args: Array<String>) {
    myFunction3()
}
