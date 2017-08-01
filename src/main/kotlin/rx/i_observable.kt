package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    
    // Creating an observable from array
    Observable.fromArray(listOf("a", "b", "c"))
            .map {
                it -> it.hashCode()
            }
            .subscribe {
                println("Hash code value $it")
            }

//    subscriber.dispose()
//
//    // Creating observable from iterable
//    val numbers = Observable.fromIterable((1..100))
//
//    numbers.filter {
//        it % 2 == 0
//    }.map {
//        it * 10
//    }.filter {
//        it % 7 == 0
//    }.forEach {
//        println(it)
//    }
//
//    // Creating observable
//    Observable.create<String> {
//        s ->
//        s.onNext("Hello")
//        s.onComplete()
//    }.subscribe {
//        println(it)
//    }
}
