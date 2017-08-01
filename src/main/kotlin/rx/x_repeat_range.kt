package rx

import io.reactivex.Observable
import java.util.concurrent.CountDownLatch
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    
    // Range operator
    Observable.range(1, 10)
            .map {
                it -> it * 10
            }.subscribe {
        println("Hello with $it")
    }
}
