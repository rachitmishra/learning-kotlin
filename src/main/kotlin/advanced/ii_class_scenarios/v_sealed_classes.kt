package advanced.ii_class_scenarios

/**
 * Sealed classes
 */

// anything inheriting from a sealed class has to be put in same file.
// The ability to mark a class as sealed, enables us to use these as a way in which we can define Algebraic Data Types
// sealed classes have to be found in same file

sealed class PageResult // using `sealed` only specific classes can inherit from sealed class

class Success1(val content: String) : PageResult() { // inheriting class have to be in same file
}

class Error1(val code: Int) : PageResult()

class Success(val content: String) : PageResult() {
}

class Error(val code: Int) : PageResult()

class MediumSuccess() : PageResult()

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
