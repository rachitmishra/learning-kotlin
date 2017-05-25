package basic

import java.io.File

fun main(args: Array<String>) {
    "Hello".snackCase()
    
    val file = File("input.txt")
    
    with(file.isAbsolute) {
        /* with is a high order function */
        println(file.name)
    } // explore let, apply, also
    
    val myName = "Hello"
    
    myName?.let {
        println(it)
    }
}
