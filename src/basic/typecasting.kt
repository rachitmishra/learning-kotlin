package basic

/**
 * Type castings
 */

open class MyPerson {

}

class MyEmployee : basic.MyPerson() {
    fun vacationDays(days: Int) {
        if (days < 60) println("Need holidays!")
    }
}

class MyContractor : basic.MyPerson() {
    fun vacationDays(days: Int) {
        if (days < 10) println("No more holidays!")
    }
}

fun hasMoreVacation(obj: basic.MyPerson) {
    if (obj is basic.MyEmployee) {
        obj.vacationDays(50)
    }
}

var myInteger : Any = 10

fun main(arg: Array<String>) {
    var myMessage: String? = null
    myMessage = "Nopes!"
    println(myMessage.length)

    //val myString = basic.getMyInteger as String // Casting Integer to String. This is ClassCastException
    val myString = basic.myInteger as? String // Using ? it gives us safe type casting and avoids ClassCastException
    println(myString?.length) // Using ? to avoid NPE
}
