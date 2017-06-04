package basic.iii_classes

import java.awt.event.ActionListener

/**
 * Classes
 */

// internal is a new visibility modifier, classes with this modifier are only visible in package scope

class Empty // an empty class

class EmptyClassWithOptionalBody {
    var name: String = ""
}

class ICantBeCreate private constructor() {
    // private constructor class can't be created
}


// class initialised with constructor
class EmployeeWithPrimaryConstruct constructor(var name: String) {
    init {
        // primary constructor initializations go in init block
    }
}

// class initialised with constructor
class EmployeeWithNestedClass constructor(var employeeName: String) {
    
    init {
        // primary constructor initializations go in init block
    }
    
    class MyNestedEmployeeClass(val name: String) {
        fun insideNestedEmployeeClass() {
            println("Inside nested employee class $name")
        }
    }
    
    inner class MyNestedInnerEmployeeClass(val name: String) { /* Using inner keyword for nested class we can access members from parent class */
        fun insideNestedInnerEmployeeClass() {
            println("Inside nested employee class $name and $employeeName")
        }
    }
    
    /* window.addMouseListener(object: MouseAdapter() { // Object classes can also be anonymous inner classes
        override fun mouseClicked(e: MouseEvent) {
            // ...
        }
    }) */
}

// initialising class constructor with default values
// the constructor keyword can be omitted if there are no visibility modifiers or annotations
class Employee(var id: Int, var name: String = "My name") : Any() {
    var email: String = ""
    
    // init blocks are used for initialisations
    init {
        name = name.toUpperCase() // initialising properties
    }
    
    constructor(email: String) : this(0, "Krish")  /* call to primary constructor */ {
        this.email = email
    }
    
    val age: Int
        get() = 2 /* Custom getter */
    
    var socialSecurityNumber: String = ""
        set(value) { /* Custom setter */ /*declaring a setter private makes it inaccessible from outside */
            var value2 = value + "FX"
            field = value2 /* Update backing field with new value */
        }
    
    fun print(): Unit {
        println("basic.Emp id $id with $name")
    }
    
}

fun main(arg: Array<String>) {
    val emp = Employee(1)
    val emp2 = Employee(1)
    emp.print()
    emp2.print()
    
    EmployeeWithNestedClass.MyNestedEmployeeClass("John").insideNestedEmployeeClass()
    ActionListener { println("clicked") } /* if object is instance of functional java interface or has single method it can be created with a lambda expression */
}
