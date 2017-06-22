package advanced.vi_async_programming

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * Coroutines
 */

fun main(args: Array<String>) {
    // Read about coroutines on kotlinlang.org
    
    val myName = "My background task"
    
    launch(CommonPool) {
        delay(1000)
        println("Inside another thread")
    }
    
    println("Back to my thread")
    Thread.sleep(2000)
}

suspend fun myFunction2() {

}
