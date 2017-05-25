package basic

import jdk.nashorn.internal.objects.NativeArray.forEach
import java.time.Duration

fun main(args: Array<String>) {
    val elements = 1..10000
    val filterElements = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
    filterElements.forEach {
        println(it)
    }
    
    val output = elements.asSequence().take(30).sum()
    println(output)
    
    val myNumbers = generateSequence(100) { x -> x * 10 }
    println(myNumbers.take(30).sum())
    
    val lazyInit: Int by lazy { 10 } // Lazy initialization
}
