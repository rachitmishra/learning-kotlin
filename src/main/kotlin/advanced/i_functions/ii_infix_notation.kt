package advanced.i_functions

/**
 * Infix notations
 */

infix fun String.isEqualTo(myStr: String) = this == myStr

fun main(args: Array<String>) {
    "Rachit".isEqualTo("Rachit") // extension function call
    "Rachit" isEqualTo "Rachit" // infix notation call
    
    val name = "Rachit"
    
    name isEqualTo "Rachit"
    
    // infix works when infix notation is used
    // works with extension function or member functions with single parameter
}

