package advanced.i_functions

fun factorial(num: Int): Int {
    when (num) {
        0, 1 -> return 1
        else -> return num * factorial(num - 1)
    }
}

tailrec fun factorialTR(num: Int, accumulator: Int = 1): Int {
    /* tailrec keyword tells the compiler that the function is using tail recursion, and the compiler uses goto (see bytecode) instead of recursion, helping us in tail call optimization*/
    when (num) {
        0 -> return accumulator
        else -> return factorialTR(num - 1, num * accumulator)
    }
}

// class MediumSuccess2() : PageResult2() // access to sealed class will fail

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTR(5))
}
