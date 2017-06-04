package basic.viiii_std_library

fun main(args: Array<String>) {
    val elements = 1..10000
    val filterElements = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }
    filterElements.forEach {
        println(it)
    }
    
    val output = elements.asSequence().take(30).sum()
    // asSequence converts a collection into a lazy collection and it evaluates immediately
    println(output)
    
    val myNumbers = generateSequence(100) { x -> x * 10 }
    println(myNumbers.take(30).sum())
    
    val lazyInit: Int by lazy { 10 } // Lazy initialization of a value. only when it is needed it will be initialized
}
