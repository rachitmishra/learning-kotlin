package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    
    Observable.fromArray("Hello", "to", "the", "World")
            .map {
                "$it map"
            }.subscribe {
        println("After map $it")
    }
    
    Observable.fromArray("url1", "url2", "url3")
            .flatMap {
                Observable.fromArray(it)
            }.subscribe {
        println("After flat map $it")
    }
}
