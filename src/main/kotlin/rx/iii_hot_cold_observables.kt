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
    
    val coldObserver = Observable.timer(1, TimeUnit.SECONDS).publish()
    
    coldObserver.connect()
    
    coldObserver.subscribe {
        println(it)
    }
    
    coldObserver.subscribe {
        println(it)
    }
    
    val warmObserver = Observable.fromArray(arrayOf("1", "2", "3")).replay()
    warmObserver.subscribe {
        println("Warm subscribe one! $it")
    }
    
    warmObserver.subscribe {
        println("Warm subscribe two! $it")
    }
    
    warmObserver.connect()
    
    warmObserver.subscribe {
        println("Warm subscribe three! $it")
    }
    
}
