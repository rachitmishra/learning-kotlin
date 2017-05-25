package basic

/**
 * Inheritance
 */

open class Person(var name: String) { // a class/function should be declared `open` for inheritance
    open fun print() {
        println("The name is $name")
    }
}

open class Contact : basic.Person("Raju") {
    final override fun print() { // this function can't be overridden in child classes as it is `final`
        println("You are $name")
    }
}

class Favorite : basic.Contact()

data class Starred(var myName: String) : basic.Person("Shyam") // `data` classes can inherit from `open` classes

/* Abstract classes */


fun main(arg: Array<String>) {
    val ct = basic.Contact()
    ct.print()
}
