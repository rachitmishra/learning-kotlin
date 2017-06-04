package advanced.iv_generics

import advanced.iii_delegation.Employee
import basic.iv_inheritance.Person

/**
 * Covariance
 */

// List<T> is covariant when Employee is subtype of Person & List<Employee> is subtype of List<Person>
// And values are passed out (i.e. they won't be modified)
// We use `out` modifier to indicate covariance (similar to ? extends T) at declaration site rather than at use site

interface MyReadOnlyInterface<out T> { // using out modifier we respect the covariance of type
    fun getId(): T
    fun getAll(): List<T>
}

class MyReadOnlyInterfaceImpl<out T> : MyReadOnlyInterface<T> {
    override fun getAll(): List<T> {
        TODO("not implemented")
    }
    
    override fun getId(): T {
        TODO("not implemented")
    }
}

fun main(args: Array<String>) {
    val myReadOnlyInterfaceImpl = MyReadOnlyInterfaceImpl<Employee>()
    val myReadOnlyInterfaceImpl2 = MyReadOnlyInterfaceImpl<Person>()
    myReadOnlyInterfaceImpl.getId()
}
