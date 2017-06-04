package basic.i_basics

/**
 * Loops and ranges
 */

fun main(arg: Array<String>) {
    var myList = listOf("Hello, world")

    // for
    for (myString in myList) {
        println(myString)
    }

    // downTo is used for reverse range
    // step is used to specify stepping value
    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    // .. is used for range or reverse range
    // step is used to specify stepping value
    for (a in 100..1 step 5) {
        println(a)
    }

    // while
    var i = 100
    while (i > 0) {
        i--
        println(i)
    }

    // do while
    do {
        var i = 100
        i--
        println(i)
    } while (i > 0)

    // @ can be used to label control flow (for)
    x@ for (a in 100..1 step 5) {
        if (a == 50) {
            break@x
        }
        println(a)
    }
}
