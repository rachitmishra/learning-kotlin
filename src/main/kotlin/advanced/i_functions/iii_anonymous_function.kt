package advanced.i_functions

/**
 * Anonymous functions
 */

fun myFunction1(myInt: Int, op: (Int) -> Int): Int {
    return op(myInt)
}

fun main(args: Array<String>) {
    myFunction1(3) {
        it * it // lambda expression
    }
    
    myFunction1(3, fun(x): Int {
        // anonymous function // the return type can be expressed in anonymous function
        
        if (x == 0) {
            return 1 // return
        }
        
        return x * x // return statement gives us flexibility for multiple return point
    })
}
