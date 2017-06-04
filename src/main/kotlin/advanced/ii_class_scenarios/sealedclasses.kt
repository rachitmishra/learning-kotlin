package advanced.ii_class_scenarios

/**
 * Sealed classes
 */


sealed class PageResult // using `sealed` only specified classes can inherit from sealed class

class Success1(val content: String) : PageResult() {
}

class Error1(val code: Int) : PageResult()

class Success(val content: String) : PageResult() {
}

class Error(val code: Int) : PageResult()

class MediumSuccess() : PageResult()

// anything inheriting from a sealed class has to put in same file. sealed class has to be found in same file

fun getUrl(url: String): PageResult {
    val wasValidCall = true
    if (wasValidCall) {
        return Success("Is valid")
    } else {
        return Error(100)
    }
}

fun main(args: Array<String>) {
    
    val pageResult = getUrl("my url")
    
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.code)
    }
}
