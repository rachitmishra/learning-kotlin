package advanced.vi_async_programming

/**
 * Coroutines
 */

suspend fun myFunction() {
     // do something for really long
}

fun <T> async(block: suspend () -> T) { // a lambda with suspend keyword -> suspending lambda
}

fun main(args: Array<String>) {
     async {
          myFunction() // suspending functions can not be called from a non co-routine context
     }
}
