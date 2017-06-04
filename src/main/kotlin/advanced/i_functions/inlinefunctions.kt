package advanced.i_functions

/**
 * Inline functions
 */

inline fun myOperation(noinline op: () -> Unit) {
    /* inline keyword inlines the high order function/lambda to where it is called*/
    /* noinline keyword tells the compiler to not inline function/lambda to where it is called*/
    println("Before op")
    op()
    println("After op")
}

fun myOperation2() {
    myOperation { println("This is my op") }
    // Another copy will be created for this in bytecode if it is not using `inline`
}

inline fun myFunction3(noinline op: () -> Unit) {
 val reference = op
}

fun main(args: Array<String>) {
    myOperation { println("This is my op") }
}
