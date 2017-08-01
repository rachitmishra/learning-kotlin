package rx

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.reactivex.rxkotlin.Observables as KObservable

fun main(args: Array<String>) {
    
    Observable.fromArray("url1", "url2", "url3")
            .applySchedulers()
            .flatMap {
                Observable.fromArray(it)
            }.subscribe {
        println("After flat map $it")
    }
}

fun <T> Observable<T>.applySchedulers(): Observable<T> =
        subscribeOn(Schedulers.io()).observeOn(Schedulers.computation())
