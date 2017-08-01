package rx

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.rxkotlin.zipWith
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import io.reactivex.internal.subscriptions.SubscriptionHelper.cancel



interface MyObservable<T> {
    fun subscribe(myObserver: MyObserver<T>)
}

interface Subscription {
    fun dispose()
}

interface MyObserver<T> {
    fun onNext(x: T): Unit {
    }
    
    fun onError()
    
    fun onCompleted()
}

fun main(args: Array<String>) {
    
    // Observable when called with subscribe sleeps for 1000ms
    val observable = Observable.create<Any> {
        s ->
        try {
            println("Sleeping for 1000ms")
            Thread.sleep(1000)
            s.onComplete()
        } catch (ex: InterruptedException) {
            s.onError(ex)
        }
    }
    
    observable.subscribe({}, {}, { println("Done sleeping!")})
    
    val executorService = Executors.newSingleThreadExecutor()
    val subscribeOn = Observable.create<Any> {
        s ->
        val f = executorService.submit {
            observable.subscribe(s as Observer<in Any>)
        }
        f.cancel(true)
    }
    
    val executorService2 = Executors.newSingleThreadExecutor()
    val subscribeOn2 = Observable.create<Any> {
        s ->
        val f = executorService2.submit {
            subscribeOn.subscribe(s as Observer<in Any>)
        }
        f.cancel(true)
    }
    
    subscribeOn2.subscribe {
        println("Well!")
    }
    
}
