package meetup

import basic.vi_tidbits.myInteger
import basic.vii_functional_programming.unaryOp

val mySomeNumber = 0
// Top level functions
fun main(args: Array<String>) {
    
    
    val myName = "World"
    println("My name is $myName")


//    val myValue1 = "That guy"
//
//    myValue1 = if (mySomeNumber < 1) {
//        "One"
//    } else {
//        "Two"
//    }
//
//    println(myValue1)
    
    
    //     println("Hello world".toSnackCase())


//    unaryOp(3) {
//        it*it
//    }

//    val myLambda: (Int) -> Int = { x -> x + x }
//    unaryOp(4, myLambda)

//
//    unaryOp {
//        it*it
//    }
//


//    unaryOp (3, ::sum)


//    var myString: String = null
//    println("Length of my integer is ${myString?.length}")


//    var myInteger = 0
//    println("Length of my integer is ${(myInteger as? String)?.length}")


//    val myVal:String? = null
//    myVal?.let {
//        println(it)
//    }
    
//    val person = Person()
//    person.printSelf()
//    val person2 = Person("HaKr", 29)
//    person2.printSelf()
//    val person3 = MyNewPerson()
//    person3.printSelf()
    
    //printSomething()
}


fun String.toSnackCase(): String {
    return this.split(" ").joinToString("_")
}

//a high order function with lambda/function receiver
fun unaryOp(num1: Int = 2, op: (Int) -> Int) {
    println(op(num1))
}

fun sum(myNum: Int) = myNum + myNum

class Person(var myName: String = "Default name", var age: Int = 20) {
    init {
        myName = myName.toSnackCase()
    }
    
    fun printSelf() {
        println("Name $myName, with age $age")
        
    }
}


//class MyNewPerson : Person("Some name", 35)

//object MyObject {
//    fun printSomething() {
//        println("Let's print something")
//    }
//}


