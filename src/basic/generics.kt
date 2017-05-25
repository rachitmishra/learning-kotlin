package basic

/**
 * Generics
 */

data class User(var name: String)

interface MyRepository<T> { // Generic interfaces
    fun getById(id: Int): T
    fun getAll(): Array<T>
}

class MyRepositoryImpl<T> : basic.MyRepository<T> {
    override fun getAll(): Array<T> {
        throw NotImplementedError("Not implemented")
    }

    override fun getById(id: Int): T {
        throw NotImplementedError("Not implemented")
    }
}

interface MyRepository2 {
    fun <T> getById(id: Int): T // Generic functions
    fun <K> getAll(): Array<K> // With different types we can have generic methods, else it isn't recommended
}

class MyRepositoryImpl2 : basic.MyRepository2 {
    override fun <T> getAll(): Array<T> {
        throw NotImplementedError("Not implemented")
    }

    override fun <K> getById(id: Int): K {
        throw NotImplementedError("Not implemented")
    }
}

fun main(arg: Array<String>) {
//    val myRepoImpl = basic.MyRepositoryImpl<basic.User>()
//    val myUser = myRepoImpl.getById(1)
//    val myUsers = myRepoImpl.getAll()
    val myRepoImpl = basic.MyRepositoryImpl2()
    val myUser = myRepoImpl.getById<basic.User>(1)
    val myUsers = myRepoImpl.getAll<basic.User>()
}
