package advanced.ii_class_scenarios

/**
 * Late initialization
 */

interface MyRepository<T> {
    fun getAll(): List<T>
}

class CustomerController {
    lateinit var repository: MyRepository<MyCustomer> // using `lateinit` modifier we can tell the compiler that we are going to lazy initialize this property
    
    fun index() : String {
        return repository.getAll().toString()
    }
    
    // Using inversion of control framework, repository property has to be initialized, so we can't initialize it, but we want it to be lazy initialized
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    customerController.index()
}
