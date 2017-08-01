/**
 * Learnings

Observable
-> disposable()

-> Single
-> Single item or Error (No BP)
-> Reactive Scalar

-> Completable
-> Either completes or Error (No BP)
->

-> Maybe
-> Has Item, No Items or Error
-> Reactive Optional


Flowable
-> backpressure
-> cancel()
-> request(long n)

interface Publisher<T> {
    void onSubscribe(Subscriber<? super T> s)
}

interface Subscriber<T> {
    void onNext(T t)
    void onComplete()
    void onError(Throwable t)
    void onSubscribe(Subscription s)
}

interface Subscription {
    void request(long n)
    void cancel()
}

Operators
->

**/
