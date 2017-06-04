package advanced.i_functions

/**
 * Lambda extension
 */

class Request(val method: String, val query: String, val contentType: String)

class Response(val contents: String, var status: Status) {
    operator fun invoke(f: Status.() -> Unit) {
    }
    
    fun status(f: Status.() -> Unit) {}
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    
    fun executeNext() {
        executeNext = true
    }
}

fun myResponse(f: Response.() -> Unit) = Unit

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler("/index.html") {
        /* extension functions have access to member/properties of class */
        
        if (request.query != "") {
        }
        
        myResponse {
            status {
                code = 404
                description = "Not found"
            }
        }
    }
}
