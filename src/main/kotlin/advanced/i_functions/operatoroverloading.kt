package advanced.i_functions

/**
 * operator overloading
 */


data class MyOperatorOverloadedTimeClass(val hours: Int, val mins: Int) {
    operator fun plus(time: MyOperatorOverloadedTimeClass): MyOperatorOverloadedTimeClass {
        /* operator keywords lets us overload operators*/
        return MyOperatorOverloadedTimeClass(this.hours + time.hours, this.mins + time.mins)
    }
}

operator fun String.plus(anotherString: String): String {
    return this + anotherString
}

fun main(args: Array<String>) {
    println(MyOperatorOverloadedTimeClass(10, 30) + MyOperatorOverloadedTimeClass(3, 30))
    println("Rachit" + "Mishra")
}
