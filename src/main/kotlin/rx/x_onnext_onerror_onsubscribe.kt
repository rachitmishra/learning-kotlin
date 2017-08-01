package rx

import io.reactivex.Observable
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    val one = Observable.fromArray("1", "2", "3")
    val two = Observable.fromArray("4", "5", "6")
    
    Observable.merge(one, two)
            .subscribe {
                println("After merge $it")
            }
    
//    Observable.zip(one, two, { x, y -> x + y })
//            .subscribe {
//                println("After merge $it")
//            }
    
}
