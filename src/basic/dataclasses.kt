package basic

/**
 * Data classes
 */

data class Employee2(var id: Int, var name: String = "No name") /*data class*/ {
    override fun toString(): String {
        return "{\n  \"id\" : \"$id\",\n  \"name\" : \"$name\"\n}\n\n"
    }
}

fun main(arg: Array<String>) {
    val emp1 = basic.Employee2(1, "Javed")
    val emp2 = basic.Employee2(1, "Javed")
    println(emp2)
    println(emp1 == emp2)
    val emp3 = emp1
    val emp4 = emp1.copy(name = "Shakti")
    println(emp3)
    print(emp4)
}
