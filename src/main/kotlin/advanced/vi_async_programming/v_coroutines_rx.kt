package advanced.vi_async_programming

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHub {
    @GET("orgs/{user}/repos")
    fun orgRepos(@Path("user") user: String): Observable<List<Repo>>
}

data class Repo(val name: String)
fun hello(value: String = "It's me") {

}
fun main(args: Array<String>) {
    val retrofit = Retrofit.Builder().apply {
        baseUrl("https://api.github.com")
        addConverterFactory(GsonConverterFactory.create())
        addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }.build()
    
    val github = retrofit.create(GitHub::class.java)
}
