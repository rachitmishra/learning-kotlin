package basic.iii_classes

/**
 * Objects
 * can be used to create singletons
 */

object Egg {
    var color: String = "white"
    
}

fun main(arg: Array<String>) {
    println(Egg.color)
    
    val localObject = object { // local object class
        var color: String = "red"
    }
    
    println(localObject.color)
    
    MyClassWithCompanionObject.create() // more like static methods, companion object methods can be access directly
}

class MyClassWithCompanionObject {
    companion object MyFactory { // companion objects can be declared inside classes.
        fun create() {
            println("MyClassWithCompanionObject")
        }
    }
}
