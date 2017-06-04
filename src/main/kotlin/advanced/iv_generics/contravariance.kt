package advanced.iv_generics

/**
 * Contravariance
 */

import advanced.iii_delegation.Employee3


// Structure<T> is contravariant when Employee is subtype of Person & Structure<Person> is subtype of Structure<Employee>
// And values are passed in (i.e. they won't be modified)
// We use `in` modifier to indicate contravariance (similar to ? super T) at declaration site rather than at use site

open class Person4

class MyEmployee4 : Person2()

interface MyWriteOnlyInterface4<in T> { // using out modifier we respect the covariance of type
    fun save(myItem: T)
    fun saveAll(myItems: List<T>)
}

class MyReadOnlyInterfaceImpl4<T> : MyReadOnlyInterface<T> {
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
