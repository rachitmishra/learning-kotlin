package advanced.iii_delegation

import kotlin.properties.Delegates.observable
import kotlin.properties.Delegates.vetoable

/**
 * Delegates: Built in delegates. Read stdlib to built in delegatable properties
 */

data class Employee(var id: Int, var name: String = "No name") /*data class*/ {
    var department: String by observable("", { property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    }) // observable delegate is a built in delegate which observes for changes in property
}

class Veto() /*class*/ {
    var value: String by vetoable("String", {
        property, oldValue, newValue ->
        newValue.startsWith(newValue) // Setting a value based on condition
    }) // observable vetoable is a built in delegate which changes value only when some condition is met
}


fun main(arg: Array<String>) {
    val employee = Employee(1, "Ken")
    employee.department = "Engineering"
}
