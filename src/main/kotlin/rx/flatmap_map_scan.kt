package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    val observable = Observable.fromArray("Hello", "to", "the", "World")
    
    observable.map {
        it + "Mapping"
    }.subscribe {
        println("After map $it")
    }
}
