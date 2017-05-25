package basic

/**
 * Functions
 */

fun main(arg: Array<String>) {
    // Named param call
    println(basic.hello(world = "Bits"))
    println(basic.hello())
    basic.hello("1", "2", "3")
    //basic.helloWithException()
}

// single line functions
// param basic.hello with default value
fun hello(hello: String = "World", world: String) = world

fun hello() = Unit

// any number of arguments using vararg
fun hello(vararg strings: String) {
    basic.printStrings(*strings) // using * we can spread vararg
}

private fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun helloWithException(): Nothing {
    throw Exception("Bleh!")
}
