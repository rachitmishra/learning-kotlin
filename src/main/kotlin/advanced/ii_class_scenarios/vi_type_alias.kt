package advanced.ii_class_scenarios

// typealias provides more semantic meaning to our code
typealias Name = String /* aliasing a type*/
typealias EmailData = String /* aliasing a type*/

class Employee(var name: String, var email: String) { /* what if we need to create a type name*/
    fun printName(name: String) = println(name)
}

class Employee2(var name: Name, var email: EmailData) { /* EmailData is typealias for String*/
    fun printName() = println(name)
}

fun main(args: Array<String>) {
    
    val employee = Employee("Rachit", "rachit@mishra.con")
    employee.printName("Rachit")
}
