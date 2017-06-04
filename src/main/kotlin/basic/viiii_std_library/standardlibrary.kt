package basic.viiii_std_library

import java.util.*

/**
 * Kotlin Standard library
 *
 * Read more about Kotlin standard library by exploring the code
 */

fun main(arg: Array<String>) {
    
    // collections List, Arrays, Maps, Sets, HashMaps, HashSets
    
    var listOfString : List<String> = java.util.ArrayList() // declaring a type immutable, but instantiating with mutable type
    var emptyList = emptyList<String>()
    var listOfString3  = Arrays.asList("Rachit", "Mishra", "Preet")
    var listOfString2  = listOf("Rachit", "Mishra", "Preet") // Immutable list can just be read and not edited
    var mutableLists  = mutableListOf("Rachit", "Mishra", "Preet") // Mutable list can be written as well as read
    val myHashmap = hashMapOf(Pair("Rachit", "Mishra"), Pair("Rachit", "Mishra"))
    val mySet = setOf(Pair("Rachit", "Mishra"), Pair("Rachit", "Mishra"))
    val booleans = booleanArrayOf(true, false, true, false) // charArrayOf, intArrayOf, longArrayOf
    
    // filering, mapping,
}
