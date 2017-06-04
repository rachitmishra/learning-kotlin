package advanced.v_metaprogramming


/**
 * Type erasure
 */


fun <T> printList(list: List<T>) {
    when(list) {
        //is List<Int> -> println("my integer list")
        //is List<String> -> println("my string list")
    }
    
    if (list is List<*>) {
        println("my list")
    }
}

fun <T> printList(obj: T) {
    when(obj) {
        is Int -> println("my integer list")
        is String -> println("my string list")
    }
}

inline fun <reified T> erased(list: List<T>) {
    when(list) {
        is T -> println("my integer list")
    }
}

inline fun <reified T> typeInfo() { // Avoids type erasure and preserves the type
    println(T::class)
}


fun main(args: Array<String>) {
    val myList = listOf("one", "two", "three")
    
    typeInfo<String>()
}
