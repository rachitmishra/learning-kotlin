package network

data class Post(var userId: String, var id: String, var title: String, var body: String)

data class Posts(var posts: List<Post>)

