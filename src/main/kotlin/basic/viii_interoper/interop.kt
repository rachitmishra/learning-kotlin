package basic.viii_interoper

/**
 * Interop with java
 */

fun main(arg: Array<String>) {
    val runnable = Runnable { println("My runnable") } // Runnable from java.lang is used
    // we can use lambda function to pass the code directly inside { } rather than implementing the interface
    
    // calling java methods from kotlin
    val myCustomer = Customer()
    myCustomer.myString() // This isn't suggested as String! as using an @Not-null in myString
    // we specified it is never going to be null
    myCustomer.myNullableString() // This is suggested as String!
}

