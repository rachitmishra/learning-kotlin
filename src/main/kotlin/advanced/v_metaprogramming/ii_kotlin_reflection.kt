package advanced.v_metaprogramming

import java.lang.reflect.Type
import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Kotlin Reflections
 */

class Transaction2(val id: Int, val amount: Int, val desc: String = "Default value") {
    fun isValid() = (amount > 1000)
}

fun introspectInspection2(obj: Any) {
    println(obj.javaClass.simpleName)
    println("Properties")
    obj.javaClass.declaredFields.forEach {
        println(it.name)
    }
    
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }
}

fun getKotlinType(obj: KClass<*>) { // java.lang.reflect.Type
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
    val classInfo = Transaction2::class
    
    classInfo.members.forEach {
        println(it.name)
    }
    println(classInfo) // we can pass a type as
    getKotlinType(classInfo) // we can pass a type as
    
    val constructor = ::Transaction2 // get an instance of constructor
    println(constructor)
    
    val transaction = constructor.call(1, 1000)
    println(transaction.amount)
    
    val validateFunction = Transaction2::isValid
    println(validateFunction)
    
    // we need to help the callBy as it can't figure out the default value
    val transaction2 = constructor.callBy(mapOf(constructor.parameters[0] to 1, constructor.parameters[1] to 1000))
    // Refering params by position
    println(transaction2.desc)
    
    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }
    
    val transaction3 = constructor.callBy(mapOf(idParam to 1, amountParam to 1000)) // Refering params by custom name
    println(transaction3.desc)
    
    val transaction4 = Transaction2(1, 20, "New value")
    
    val namedProperty = Transaction2::class.memberProperties.find { it.name == "desc" } // Getting a named property
    
    println(namedProperty?.get(transaction4)) // Getting a named property value
}
