package basic.iv_inheritance

/**
 * Inheritance
 */

open class Person(var name: String) {
    // a class/function should be declared `open` for inheritance, by default all classes are final
    
    open val myEmail = "email@gmail.com"
    open var myAnotherEmail = "email@gmail.com"
    open fun print() {
        println("The name is $name")
    }
}

open class Contact : Person("Raju") {
    final override fun print() { // this function can't be overridden in child classes as it is `final`
        println("You are $name")
    }
}

open class AnotherContact : Person("Raju") {
    
    override val myEmail = "" // we can override properties of super classes
    // override val myAnotherEmail = "" // overiding var with val isn't possible
    
    final override fun print() { // this function can't be overridden in child classes as it is `final`
        println("You are $name")
    }
}

class Favorite : Contact()

data class Starred(var myName: String) : Person("Shyam") // `data` classes can inherit from `open` classes


fun main(arg: Array<String>) {
    val ct = Contact()
    ct.print()
}
