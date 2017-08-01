package network

import io.reactivex.Observable
import retrofit2.http.GET

interface PostService {
    
    @get:GET("posts")
    val getPosts: Observable<Posts>
}

