package basic.vi_tidbits

import com.sun.tools.javac.jvm.ByteCodes.ret

/**
 * Semantic validation
 */

fun main(arg: Array<String>) {
    val myNumber: Int? = 2
    
    checkNotNull(myNumber) {
        println("yes it isn't")
    }
    
    myNumber?.let { // checks for null and reads the variable only once and we can use the it reference
        println(it.toString())
    }
    
    myOtherFunction().let { // let also helps in reading a return value of a function once and using it multiple times
        it.filter { it.startsWith('O') }.first { println(it); true }
    }
    
    val myOtherNumber = 3
    
    require(myOtherNumber > 2) {
        println("No it isn't")
    }
    
    println("It is greater $myOtherNumber")
    
    
    myNumber?: throw IllegalArgumentException("You missed it")
}

fun myOtherFunction()  = listOf("One", "Two", "Three", "Four", "Once", "Twice")
