package basic

/**
 * Tuples
 */
class NotANumberException(message: String) : Throwable(message)

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Float, Double, Long -> throw basic.NotANumberException("This is not a number!")
        else ->
            println("Is number")
    }
}

fun main(args: Array<String>) {
//    try {
//        basic.checkIsNumber("Hello")
//    } catch (e: basic.NotANumberException) {
//        println("${e.message}")
//    } catch (e: IllegalArgumentException) {
//        println("What! No...")
//    }

    var buffer: java.io.BufferedReader? = null
    val result = try { // try-catch blocks can return result
        buffer = java.io.BufferedReader(java.io.FileReader("input.txt"))
        val chars = CharArray(30)
        buffer?.read(chars, 0, 30)
    } catch (e: java.io.FileNotFoundException) {
        println("File not found")
    } finally {
        println("Close buffer")
        buffer?.close()
    }

    println(result)
}
