package advanced.i_functions

/**
 * Invoking instances
 */

class Request(val method: String, val query: String, val contentType: String)

class Response(val contents: String, var status: Status) {
    operator fun invoke(f: Status.() -> Unit) {
    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    
    fun executeNext() {
        executeNext = true
    }
}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
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
