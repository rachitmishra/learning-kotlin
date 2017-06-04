package advanced.iii_delegation

import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable

/**
 * Delegates: Built in delegates
 */


data class Employee3(var id: Int, var name: String = "No name") /*data class*/ {
    
    var department: String by observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    })
}

class Veto() /*class*/ {
    
    var value: String by vetoable("String", {
        property, oldValue, newValue ->
        newValue.startsWith(newValue) // Setting a value based on condition
    })
}


fun main(arg: Array<String>) {
    val employee = advanced.iii_delegation.Employee3(1, "Ken")
    employee.department = "Engineering"
}
