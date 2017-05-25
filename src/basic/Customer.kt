package basic

/* class initialised with constructor */
class Customer(var id: Int, var name: String = "My name") : Any() { /* initialising class with default value */
    
    var email: String = ""
    @JvmField val myJvmField = "my jvm field" // By default kotlin won't create fields. By using the annotation @JvmField we can create field which can be accessed from Java
    
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
    
    @JvmOverloads fun changeStatus(status: basic.Customer.Status = basic.Customer.Status.APPROVED) {  /* Using @JvmOverloads we can create overloaded version of the method*/
        
    }
    
    @JvmOverloads @JvmName("preferential") fun makePreferred(status: basic.Customer.Status = basic.Customer.Status.PENDING) {  /* Using @JvmName we can change the name of the method and how it can be accessed from Java*/
    
    }
    
    @Throws(java.io.IOException::class)
    fun throwsException() {  /* Using @Throws we can throw an exception from Kotlin to Java */
        throw java.io.IOException("Bleh!!")
    }
    
    enum class Status {
        APPROVED,
        PENDING
    }
}
