package basic

/**
 * Lambdas
 */

fun unaryOp(num1: Int, op: (Int) -> Int) {
    println(op(num1))
}

fun unaryOp(op: (Int) -> Int) {
    println(op(0))
}

fun transaction(db: basic.Database, code: () -> Unit) { // example of micro DSL (domain specific language)
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit(): Unit {
    }
}


fun main(args: Array<String>) {
    println(operation(1, 3, { x, y -> x + y })) // Lambda expression

    val myLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(myLambda(1, 2))
    basic.unaryOp(2, { x -> x * 2 })
    basic.unaryOp(2, { it * it }) // single param lambda
    basic.unaryOp(2) { it * it } // also a single param lambda
    basic.unaryOp { it * it } // yay! no parentheses required to pass a function
    
    basic.unaryOp {
        it * it
    } // yay! multi-line -> pass a function

    val db = basic.Database()
    basic.transaction(db) {
        // Perform the basic.operation
        // inside basic.transaction db.commit() will run after this is executed
    }
    
    basic.unaryOp(2, fun(num: Int): Int { // example of anonymous function
        if (num > 2) { // basic.main advantage is we have multiple return points
            return 0
        }
        
        return 1
    })
}
