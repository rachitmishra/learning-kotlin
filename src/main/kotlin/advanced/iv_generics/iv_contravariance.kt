package advanced.iv_generics

import advanced.iii_delegation.Employee
import basic.iv_inheritance.Person

/**
 * Contravariance
 */

// Structure<T> is contravariant when Employee is subtype of Person & Structure<Person> is subtype of Structure<Employee>
// And values are passed in (i.e. they won't be modified)
// We use `in` modifier to indicate contravariance (similar to ? super T) at declaration site rather than at use site

interface MyWriteOnlyInterface4<in T> { // using out modifier we respect the covariance of type
    fun save(myItem: T)
    fun saveAll(myItems: List<T>)
}

class MyWriteOnlyInterfaceImpl4<T> : MyWriteOnlyInterface4<T> {
    override fun saveAll(myItems: List<T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    
    override fun save(myItem: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    val myReadOnlyInterfaceImpl = MyWriteOnlyInterfaceImpl4<Employee>()
    val myReadOnlyInterfaceImpl2 = MyWriteOnlyInterfaceImpl4<Person>()
    myReadOnlyInterfaceImpl.save(Employee(1))
    myReadOnlyInterfaceImpl2.save(Person("jon"))
}
