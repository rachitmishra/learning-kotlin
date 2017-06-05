package advanced.v_metaprogramming

import jdk.nashorn.internal.objects.NativeArray.forEach
import java.lang.reflect.Type

/**
 * Java Reflections
 */

class Transaction(val id: Int, val amount: Int) {
    fun isValid() = (amount > 1000)
}

fun introspectInspection(obj: Any) {
    println(obj.javaClass.simpleName)
    println("Properties")
    obj.javaClass.declaredFields.forEach {
        println(it.name)
    }
    
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }
}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    introspectInspection(Transaction(1, 200))
    getType(Transaction::class.java)
}
