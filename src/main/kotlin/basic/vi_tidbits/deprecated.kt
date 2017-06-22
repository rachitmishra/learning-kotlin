package basic.vi_tidbits

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/**
 * Measure code blocks
 */

fun main(arg: Array<String>) {
    myDeprecatedFunction()
}


@Deprecated("Use myNewFunction()", level = DeprecationLevel.WARNING, replaceWith = ReplaceWith("myNewFunction()"))
// level = DeprecationLevel.WARNING shows warning while level = DeprecationLevel.ERROR throws compilation error
fun myDeprecatedFunction() {
    println("Call to deprecated method")
}

fun myNewFunction() {
    println("Call to new method")
}
