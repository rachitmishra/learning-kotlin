package advanced.iv_generics

/**
 * Invariance
 */

open class MyPerson()

class MyEmployee : MyPerson()

fun myFunction(persons: Array<MyPerson>) {
    // this will throw an error if we call with an array of MyEmployee
}

fun myInvariantFunction(persons: List<MyPerson>) {
    // using a immutable interface we can pass subtype // this is called invariance
}

fun myFunction(person: MyPerson) {}

fun main(args: Array<String>) {
    myFunction(MyPerson())
    myFunction(MyEmployee())
    //  myFunction(listOf(MyEmployee())) // Can't be called with Array of employee
    // this array is called invariant, (in java all classes are invariant)
    myInvariantFunction(listOf(MyEmployee()))
}
