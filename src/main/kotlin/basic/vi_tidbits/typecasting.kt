package basic.vi_tidbits

/**
 * Type castings
 */

open class MyPerson {

}

class MyEmployee : MyPerson() {
    fun vacationDays(days: Int) {
        if (days < 60) println("Need holidays!")
    }
}

class MyContractor : MyPerson() {
    fun vacationDays(days: Int) {
        if (days < 10) println("No more holidays!")
    }
}

fun hasMoreVacation(obj: MyPerson) {
    if (obj is MyEmployee) {
        obj.vacationDays(50)
    }
}

var myInteger : Any = 10

fun main(arg: Array<String>) {
    var myMessage: String? = null
    myMessage = "Nopes!"
    println(myMessage.length)

    //val myString = basic.getMyInteger as String // Casting Integer to String. This is ClassCastException
    val myString = myInteger as? String // Using ? it gives us safe type casting and avoids ClassCastException
    println(myString?.length) // Using ? to avoid NPE
}
