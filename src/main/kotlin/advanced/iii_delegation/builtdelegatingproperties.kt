package advanced.iii_delegation

/**
 * Delegates: Properties
 */

class MyService2 {
    var someProperty: String = "new" // delegating properties using `by`
}

fun main(args: Array<String>) {
    val service = MyService2()
    println(service.someProperty)
    service.someProperty = ""
    println(service.someProperty)
}
