package basic.ii_functions

/**
 * Functions
 */

fun main(arg: Array<String>) {
    // Named param call
    println(hello(world = "Bits"))
    println(hello())
    hello("1", "2", "3")
    //basic.ii_functions.helloWithException()
    
    1.sum(2) /* functions can be called using infix notations when they are marked with infix keyword, have just one param, or are member functions */
    1 shl 2 /* functions can be called using infix notations when they are marked with infix keyword, have just one param, or are member functions */
}

// single line functions
// param basic.ii_functions.hello with default value
fun hello(hello: String = "World", world: String) = world

fun hello() = Unit

// any number of arguments using vararg
fun hello(vararg strings: String) {
    printStrings(*strings) // using * we can spread vararg
}

private fun printStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun helloWithException(): Nothing { // Methods can also return nothing which means nothing
    throw Exception("Bleh!")
}

fun myAwesomeFunction() : Unit {
    val myNumber = 4
    fun myLocalAwesomeFunction() : Int { // We can declared function inside functions :| inception
        return myNumber // local function can access outer function val i.e closure :D
    }
}

infix fun Int.sum(num: Int): Int { /* Use infix keyword to use this method with infix notation */
    return this + num
}
