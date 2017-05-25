package basic

/**
 * Null Safety
 */
class Service {
    fun evaluate() : Unit {

    }
}

class ServiceProvider {
    fun createServices() : basic.Service? {
        return basic.Service()
    }
}

fun main(arg: Array<String>) {
    val myMessage: String = "My message"

    val myNullMessage: String? = null // ? after a type makes it nullable

    val myInferredNullMessage = null // inferred null statement

    println(myMessage.length)
    println(myNullMessage)
    // println(myNullMessage.length) this is compile time error
    println(myInferredNullMessage)

    if (null != myNullMessage) {
        println(myNullMessage.length) // now this works!
    }

    println(myNullMessage!!.length) // !! forces the compiler myNullMessage != null, and will cause NPE

    println(myNullMessage?.length) // use ? after variable to only call it's members if it is not null

    val myServiceProvider = basic.createServiceProvider()
    myServiceProvider?.createServices()?.evaluate()
    // createServices() might return null, so we use ? so evaluate only runs if createServices() != null

}

fun createServiceProvider() : basic.ServiceProvider? {
    return basic.ServiceProvider()
}
