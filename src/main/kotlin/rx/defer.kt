package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import org.reactivestreams.Subscriber
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val myClass = MyClass()
    val valueObservable = myClass.valueObservable()
    myClass.myValue = "new"
    valueObservable.subscribe {
        println(it)
    }
}

class MyClass(var myValue: String = "default") {
    fun valueObservable(): Observable<String> {
        // return Observable.just(myValue) // changes are emitted before subscription
        
        // return Observable.defer { // emission is deferred till someone subscribes
        //    Observable.just(myValue)
        //}
        
        return Observable.create({myValue})
    }
}
