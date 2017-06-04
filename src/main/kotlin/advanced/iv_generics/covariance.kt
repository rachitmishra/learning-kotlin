package advanced.iv_generics

import advanced.iii_delegation.Employee3

/**
 * Covariance
 */

// List<T> is covariant when Employee is subtype of Person & List<Employee> is subtype of List<Person>
// And values are passed out (i.e. they won't be modified)
// We use `out` modifier to indicate covariance (similar to ? extends T) at declaration site rather than at use site

open class Person2

class MyEmployee3 : Person2()

interface MyReadOnlyInterface<out T> { // using out modifier we respect the covariance of type
    fun getId(): T
    fun getAll(): List<T>
}

class MyReadOnlyInterfaceImpl<T> : MyReadOnlyInterface<T> {
    override fun getAll(): List<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    
    override fun getId(): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    val myReadOnlyInterfaceImpl = MyReadOnlyInterfaceImpl<Employee3>()
    myReadOnlyInterfaceImpl.getId()
}
