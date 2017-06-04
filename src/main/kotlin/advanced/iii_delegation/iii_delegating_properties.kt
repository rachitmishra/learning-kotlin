package advanced.iii_delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


/**
 * Delegates: Properties , eg. we can add validation before initialization properties
 */

class MyService {
    var someProperty: String by ExternalFunctionality() // delegating properties using `by`
}

// delegating properties requires us to implement setValue and getValue
// setValue is not required if the property is immutable
class ExternalFunctionality : ReadWriteProperty<MyService, String> {
    
    var backingField= "Default" // a backing field is added for default value of delegated property
    
    override fun setValue(thisRef: MyService, property: KProperty<*>, value: String) {
        backingField = value
    }
    
    override fun getValue(thisRef: MyService, property: KProperty<*>): String {
        println("${property.name}") // what's the property
        println("${thisRef.toString()}") // what's the property
        return  backingField
    }
    
    // essentially here the getter setter of someProperty have been delegated to other class for reuse
}

fun main(args: Array<String>) {
    val service = MyService()
    println(service.someProperty)
    service.someProperty = "New value"
    println(service.someProperty)
}
