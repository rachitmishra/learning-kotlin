package advanced.i_functions

fun main(args: Array<String>) {
    val myNumbers = 1..100
    myNumbers.forEach {
        if (it % 5 == 0) {
            // return -> this is local return, which will return from function
            return@forEach // this will return us too forEach and println("Hello!) will be printed)
            // non local returns(returning from main function) only allowed from inline functions (functions annotated with inline keyword)
        }
    }
    
    myNumbers.forEach myLabel@ {
        if (it % 5 == 0) {
            return@myLabel
        }
    }
    
    myNumbers.forEach(fun (x) {
        return// return from anonymous functions will do a local return and return from the anonymous function
    })
    println("Hello!")
}
