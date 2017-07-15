package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import java.io.IOException
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
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
