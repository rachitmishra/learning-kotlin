package basic.vi_tidbits

import basic.iii_classes.Employee2

/**
 * Tuples
 */

fun myFunction(country: String = "India") : Pair<String, String> {
    return Pair("Delhi", "150000")
}

fun myFunction2(country: String = "India") : Triple<String, String, Long> {
    return Triple("Delhi", "150000", 15000)
}

fun main(args: Array<String>) {
//    val myPair = basic.tidbits.myFunction()
//    println(myPair.first)
//    println(myPair.second)

//    val myPair2 = basic.tidbits.myFunction2()
//    println(myPair2.first)
//    println(myPair2.second)
//    println(myPair2.third)

    val(capital, population) = myFunction() // deconstructing values
    val(id, name) = Employee2(0, "Ravi") // deconstructing values from data classes
    println(capital)
    println(population)
    println(id)
    println(name)

    val myPairs = listOf(Pair("delhi", "india"), "islamabad" to "pakistan")
    for ((capital, country) in myPairs) {
        println(capital +"-"+ country)
    }
}
