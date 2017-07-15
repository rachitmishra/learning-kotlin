package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val coldObserver = Observable.timer(1, TimeUnit.SECONDS).publish()
  
    coldObserver.connect()
    
    coldObserver.subscribe {
        println(it)
    }
    
    coldObserver.subscribe {
        println(it)
    }
}
