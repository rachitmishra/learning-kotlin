package advanced.i_functions

/**
 * Lambda extension
 */


class Request1(val method: String, val query: String, val contentType: String)
class Response1(val contents: String, var status: Status) {
    fun status(f: Status.() -> Unit) {
    
    }
}

class Status1(var code: Int, var description: String)

class RouteHandler1(val request: Request, val response: Response) {
    var executeNext = false
    
    fun executeNext() {
        executeNext = true
    }
}

fun response1(f: Response.() -> Unit) {

}

fun routeHandler1(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main(args: Array<String>) {
    routeHandler1("/index.html") {
        /* extension functions have access to member/properties of class */
        if (request.query != "") {
        }
        
        response1 {
            //            status {
//                code = 404
//                description = "Not found"
//            }
        }
    }
}
