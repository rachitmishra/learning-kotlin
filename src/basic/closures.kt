package basic

/**
 * Closures
 */

fun myFunction3() {
//    val myNum = 3
//    basic.unaryOp(5, { x -> x * myNum }) // Lambda function able to access myNum, AKA closure

    for (num in 1..10) {
        val x = unaryOp(5, { x ->
            println(num)
            x * num }
        )
    }
}

fun main(args: Array<String>) {
    basic.myFunction3()
}
