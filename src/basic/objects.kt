package basic

/**
 * Objects
 * can be used to create singletons
 */


object Egg {
    var color: String = "white"

}

fun main(arg: Array<String>) {
    println(basic.Egg.color)

    val localObject = object { // local object class
        var color: String = "red"
    }

    println(localObject.color)
}
