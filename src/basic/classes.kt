package basic

/**
 * Classes
 */


class Emp

class Empl() {
}

// class initialised with constructor
class Employee(var id: Int, var name: String = "My name") : Any() { // initialising class with default value
    
    var email: String = ""
    
    init {
        name = name.toUpperCase() // initialising properties
    }
    
    constructor(email: String) : this(0, "Krish")  /* call to primary constructor */ {
        this.email = email
    }
    
    val age: Int
        get() = 2 // Custom getter
    
    var socialSecurityNumber: String = ""
        set(value) { // Custom setter
            var value2 = value + "FX"
            field = value2 // Update backing field with new value
        }
    
    fun print(): Unit {
        println("basic.Emp id $id with $name")
    }
    
}

fun main(arg: Array<String>) {
    val emp = basic.Employee(1)
    val emp2 = basic.Employee(1)
    emp.print()
    emp2.print()
}

// internal is a new visibility modifier
