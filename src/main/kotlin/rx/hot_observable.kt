package rx

import io.reactivex.Observable
import io.reactivex.rxkotlin.zipWith
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val hotObserver = Observable.timer(1, TimeUnit.SECONDS)
    
    hotObserver.subscribe {
        println(it)
    }
    
    hotObserver.subscribe {
        println(it)
    }
    
    while(true) {
    
    }
}
