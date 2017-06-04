package basic.viiii_std_library

import basic.vii_functional_programming.snackCase

fun main(args: Array<String>) {
    "Hello".snackCase()
    
    val file = java.io.File("input.txt")
    
    with(file.isAbsolute) {
        /* with is a high order function */
        println(file.name)
    } // explore let, apply, also
    
    val myName = "Hello"
    
    myName?.let {
        println(it)
    }
}
