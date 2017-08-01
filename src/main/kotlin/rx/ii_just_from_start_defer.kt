package rx

import io.reactivex.Observable
import java.io.IOException
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
    
    val myClass = MyClass()
    val valueObservable = myClass.valueObservable()
    myClass.myValue = "new"
    valueObservable.subscribe {
        println(it)
    }
    
    val observableEmpty = Observable.empty<String>()
    observableEmpty.subscribe({}, {
        println("Error")
    }, {
        println("Complete")
    })
    
    val observableError = Observable.error<String>(IOException())
    observableError.subscribe({}, {
        println("Error")
    }, {
        println("Complete")
    })
    
    val observableNever = Observable.never<String>()
    observableNever.subscribe({}, {
        println("Error")
    }, {
        println("Complete")
    })
}

fun myFunction(): Int = 2

class MyClass(var myValue: String = "default") {
    fun valueObservable(): Observable<String> {
        // return Observable.just(myValue) // changes are emitted before subscription
        
        // return Observable.defer { // emission is deferred till someone subscribes
        //    Observable.just(myValue)
        //}
        
        return Observable.create({myValue})
    }
}
