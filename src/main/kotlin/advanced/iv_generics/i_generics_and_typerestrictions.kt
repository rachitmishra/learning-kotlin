package advanced.iv_generics

/**
 * Type restrictions
 */

open class Entity(var id: Int) {
}

class CustomerEntity(id: Int) : Entity(id) {
}


class Repository<T : Entity> { // in kotlin, T is Any? // Using :Entity we have put upperbound restriction on T
    // to put multiple restriction we will write as
    fun save(entity: T) {
        if (entity.id != 0) { // since
            // do something
        }
    }
}

fun <T : Entity> save(entity: T) { // We can also put type restrictions on functions
    if (entity.id != 0) { // since
        // do something
    }
}

class Repository2<T> where T : Entity, T : java.io.Serializable {
    // to put multiple upperbound restriction we will write as where T:type
    
    fun save(entity: T) {
        if (entity.id != 0) { // since
            // do something
        }
    }
}
// In kotlin default type restriction is Any?, which we can change to Any
