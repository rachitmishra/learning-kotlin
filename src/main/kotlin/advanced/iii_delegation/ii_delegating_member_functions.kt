package advanced.iii_delegation

import basic.iv_inheritance.Contact

/**
 * Delegates: Functions, eg. can be used in delegating helper classes
 */


interface MyAnotherRepository {
    fun getById(id: Int): Contact
    fun getAll(): List<Contact>
}

interface Logger {
    fun logAll()
}

class Controller(val myRepo: MyAnotherRepository) : MyAnotherRepository by myRepo {
    fun index() {
        myRepo.getAll() // injecting and calling the repository functions
    }
}

// good practice is to pass lesser number of dependencies
class MyDelegatedController(myRepo: MyAnotherRepository, logger: Logger) :
// passing MyAnotherRepository is mere a dependency now
        MyAnotherRepository by myRepo, // the `by` keyword helps us in delegating functions from dependencies
//The by-clause in the supertype list for MyDelegatedController indicates that myRepo will be stored internally in objects of MyAnotherRepository and the compiler will generate all the methods of MyDelegatedController that forward to myRepo.
        Logger by logger { // delegating Logger functions using logger
    // first class delegation of member function
    // which means delegate functionality of repository to function being passed in
    fun index() {
        getAll() // calling the repository functions by using delegation
    }
}

fun main(args: Array<String>) {
}
