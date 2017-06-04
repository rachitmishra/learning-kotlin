package advanced.i_functions

import java.lang.StringBuilder

/**
 * operator overloading
 *
 * Read operator conventions
 */


data class MyOperatorOverloadedTimeClass(val hours: Int, val mins: Int) {
    operator fun plus(time: MyOperatorOverloadedTimeClass): MyOperatorOverloadedTimeClass {
        /* operator keywords lets us overload operators*/
        return MyOperatorOverloadedTimeClass(this.hours + time.hours, this.mins + time.mins)
    }
    
    operator fun minus(time: MyOperatorOverloadedTimeClass): MyOperatorOverloadedTimeClass {
        /* operator keywords lets us overload operators*/
        return MyOperatorOverloadedTimeClass(this.hours - time.hours, this.mins - time.mins)
    }
    
    operator fun invoke(f: Status.() -> Unit) {
    }
}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main(args: Array<String>) {
    println(MyOperatorOverloadedTimeClass(10, 30) + MyOperatorOverloadedTimeClass(3, 30))
    println(MyOperatorOverloadedTimeClass(10, 30) - MyOperatorOverloadedTimeClass(3, 30))
    println("Rachit" + "Mishra")
    
    val myStringBuilder = StringBuilder("My name is jon")
    for (str in myStringBuilder) {
        str + ""
    }
}
