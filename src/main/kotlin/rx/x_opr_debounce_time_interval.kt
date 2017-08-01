
package rx

import io.reactivex.Observable
import java.sql.Time
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    val observable = Observable.timer(1, TimeUnit.SECONDS)
    observable.debounce(1, TimeUnit.SECONDS)
    observable.subscribe({
        println(it)
    })
    
    val latch = CountDownLatch(5)
    Observable.timer(1, TimeUnit.SECONDS)
            .repeat(4)
            .subscribe {
                println("Got some data $it")
            }
    latch.await()
}
