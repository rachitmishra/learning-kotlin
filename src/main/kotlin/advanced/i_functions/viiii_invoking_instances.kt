package advanced.i_functions

/**
 * Invoking instances
 *
 * Read more about Anko, Gradle also allows to define scripts using Kotlin
 */

class Status1(var code: Int, var description: String)

class Response1(val contents: String, var status: Status1) {
    operator fun invoke(f: Status1.() -> Unit) {}
}
class RouteHandler1(val request: Request, val response: Response1) {
    var executeNext = false
    
    fun executeNext() {
        executeNext = true
    }
}

fun otherRouteHandler(path: String, f: RouteHandler1.() -> Unit) = Unit

fun main(args: Array<String>) {
    otherRouteHandler("/index.html") {
        /* extension functions have access to member/properties of class */
        if (request.query != "") {
        }
        
        response {
            // since this calls invoke with lambda expression
            code = 404
            description = "Not found"
        }
    }
    
    val manager = Manager()
    manager {
        // this is possible using invoke function
    }
}

class Manager {
    operator fun invoke(function: () -> Unit) {
        /* implementing `invoke` operator let's us invoke/make a class object do something just by calling it's instance*/
    }
}
