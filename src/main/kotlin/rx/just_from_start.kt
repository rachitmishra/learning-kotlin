package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    Observable.just("Hello")
            .subscribe({
                println(it)
            }, {
                println("Error")
            }, {
                println("Complete")
            })
    
    Observable.just("Hello", "World", "My", "Name")
            .subscribe({
                println(it)
            }, {
                println("Error")
            }, {
                println("Complete")
            })
    
    
    val observableFrom = Observable.fromArray("Hello", "World")
    observableFrom.subscribe({
        println(it)
    }, {
        println("Error")
    }, {
        println("Complete")
    })
    
    val observableStart = Observable.fromCallable(::myFunction)
    observableStart.subscribe({
        println(it)
    }, {
        println("Error")
    }, {
        println("Complete")
    })
}

fun myFunction(): Int = 2
