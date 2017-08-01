package network

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


fun main(args: Array<String>) {
    val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .client(OkHttpClient())
            .build()
    
    val postService = retrofit.create(PostService::class.java)
    
    postService.getPosts
            .flatMap {
                (posts) -> Observable.fromIterable(posts)
            }.subscribe {
                println("Title of post is ${it.title}")
            }
}
