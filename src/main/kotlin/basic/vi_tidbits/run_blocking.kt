import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    launch(CommonPool) {
       delay(1000)
        println("Inside coroutine")
    }
    
    delay(1000)
    println("outside coroutine")
}

fun coroutine() = runBlocking {
    val jobs = List(10000) {
        launch(CommonPool) {
            delay(1000L)
        }
    }
    jobs.forEach { println(it) }
}
