package advanced.vi_async_programming

import java.util.concurrent.CompletableFuture


/**
 * Async await
 */

fun main(args: Array<String>) {
    // Read about coroutines on kotlinlang.org
    (1..5).map {
        val string = async {
            startLongAsyncOperation(1)
        }
        
        it.toString() + "" + string
    }.forEach {
        println(it)
    }
}

suspend fun startLongAsyncOperation(it: Int) = CompletableFuture.supplyAsync {
    Thread.sleep(1000)
    "Result: $it"
}
