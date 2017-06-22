package basic.vi_tidbits

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/**
 * Measure code blocks
 */

fun main(arg: Array<String>) {
    val helloTookMillis = measureTimeMillis {
        println("Hello world")
    }
    
    
    val helloTookNanos = measureNanoTime {
        println("Hello world")
    }
    
    
    println("Hello took $helloTookMillis")
    println("Hello took $helloTookNanos")
}
