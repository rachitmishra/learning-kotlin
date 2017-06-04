package basic.i_basics

/**
 * Conditionals
 */

fun main(arg: Array<String>) {
    val hello = "Hello"
    if (hello == "Hello") {
        println("Hello from if")
    } else {
        println("Hello from else")
    }

    val helloAgain = (hello == "Hello")

    println(helloAgain)

    val helloAgain2 = if (hello is String) { // if-else as expression
        "Ok basic.ii_functions.hello!"
    } else {
        "Oops"
    }

    println(helloAgain2)

    when (hello) {
        "Hello" ->
            println("Hello from when")
    }

    var myHello: Any = "Doughnut"

    val returnFromWhen =
            when (myHello) { // when as expression
                "Doughnut" -> {
                    println("Hello from when")
                    "One"
                }
                !is String, Int, Float, Double -> {
                    println("Is string")
                    "Two"
                }
                else -> {
                    println("No doughnut for you!")
                    "Three"
                }
            }

    println(returnFromWhen)
}
