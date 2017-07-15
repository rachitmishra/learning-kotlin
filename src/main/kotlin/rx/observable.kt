package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    
    
    // Creating an observable from array
    val observable = Observable.fromArray(listOf("a", "b", "c"))
    
    
    observable.subscribe(
            { println("onNext") },
            { println("onError ${it.message}") },
            { println("onCompleted") }
    )
    
    val numbers = Observable.fromIterable((1..100))
    
    numbers.filter {
        it % 2 == 0
    }.map {
        it * 10
    }.filter {
        it % 7 == 0
    }.forEach {
        println(it)
    }
    
    val numbers2 = Observable.fromIterable(1..10)
    
    val letters = Observable.fromIterable('a'..'j')
    
    numbers2.zipWith(letters, { x, y -> Pair(x, y) }).forEach { println(it) }
    
    Observable.create<String> {
        s ->
        s.onNext("Hello")
        s.onComplete()
    }.subscribe {
        println(it)
    }
}
