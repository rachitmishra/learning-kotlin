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
    
    Observable.concat(one, two)
            .subscribe {
                println("After merge $it")
            }
    
//    Observable.zip(one, two, {1, n -> Observab)})
//            .subscribe {
//                println("After merge $it")
//            }
    
//    Observable.combineLatest(fun() {
//
//    }, two)
//            .subscribe {
//                println("After merge $it")
//            }
    
}
