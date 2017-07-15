package rx

import io.reactivex.Observable
import java.util.concurrent.CountDownLatch
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    val latch = CountDownLatch(5)
    
    val observableRepeat = Observable.just("Hello")
    observableRepeat.repeat(4)
    observableRepeat.subscribe {
        println(it)
    }
    
    latch.await()
}
