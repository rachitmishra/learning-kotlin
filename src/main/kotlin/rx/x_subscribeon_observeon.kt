package rx

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    Observable.range(1, 10)
            .map { i -> i * 100 }
            .doOnNext { i ->
                println("Emitting $i on thread ${Thread.currentThread().name}")
            }.subscribe {
        println(it)
    }
    //.map { i -> i * 10 }
    //.observeOn(Schedulers.computation())
    //.subscribe { i ->
    //    println("Received " + i + " on thread "
    //            + Thread.currentThread().name)
    // }
}
