package basic.vii_functional_programming

/**
 * Lambdas
 */

fun unaryOp(num1: Int, op: (Int) -> Int) {
    println(op(num1))
}

fun unaryOp(op: (Int) -> Int) {
    println(op(0))
}

fun transaction(db: Database, code: () -> Unit) { // example of micro DSL (domain specific language)
    try {
        code()
    } finally {
        db.commit()
    }
}

fun main(args: Array<String>) {
    println(operation(1, 3, { x, y -> x + y })) // Lambda expression

    val myLambda: (Int, Int) -> Int = { x, y -> x + y } // Type is required as compiler fails to infer type where the lambda function will be used
    println(myLambda(1, 2))
    unaryOp(2, { x -> x * 2 })
    unaryOp(2, { it * it }) // single param lambda
    unaryOp(2) { it * it } // also a single param lambda
    unaryOp { it * it } // yay! no parentheses required to pass a function
    
    unaryOp {
        it * it
    } // yay! multi-line -> pass a function

    val db = Database()
    transaction(db) {
        // Perform the operation
        // inside transaction db.commit() will run after this is executed
    }
    
    unaryOp(2, fun(num: Int): Int { // example of anonymous function
        if (num > 2) { // basic.i_basics.main advantage is we have multiple return points
            return 0
        }
        
        return 1
    })
}
