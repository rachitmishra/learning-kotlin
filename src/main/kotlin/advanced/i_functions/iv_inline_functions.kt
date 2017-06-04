package advanced.i_functions

/**
 * Inline functions
 */
// lambda functions have performance impact while supporting for java 6, as they translate to anonymous classes. If the lambda also does a closure, then a instance will also be created in java

inline fun myOperation(noinline op: () -> Unit) {
    /* inline keyword inlines the high order function/lambda and lambdas passed to it to where it is called*/
    /* noinline keyword tells the compiler to not inline function/lambda to where it is called*/
    println("Before op")
    op()
    println("After op")
}

fun myOperation2() {
    myOperation { println("This is my op") }
    // Another copy will be created for this in bytecode if it is not using `inline`
}

inline fun myFunction3(noinline op: () -> Unit, op2: () -> Unit) {
    // using noinline i tell compiler to not inline param 1 lamda
 val reference = op // without noinline modifier this line will give error
}

fun main(args: Array<String>) {
    myOperation { println("This is my op") }
}
