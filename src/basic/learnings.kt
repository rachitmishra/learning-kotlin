/**
 * Learnings
 */

// Kotlin is not immutable by default
// no explicit type conversion
// Use `val` to declare a immutable value (or constant)
// Use `var` to declare mutable value
// Using $ we can do string interpolation
// .. is used for range or reverse range
// step is used to specify stepping value
// upTo, downTo can be used to step upwards or downwards
// @ can be used to label control flow (for)
// object keyword let's create object class/singleton class. we can have local object classes inside functions
// data keyword let's create data classes.
// we can have named Pair, Or Triple and also Lists
//!! forces the compiler myNullMessage != null, and will cause NPE
// ? after a type makes it nullable
// use ? after variable to only call it's members if it is not null
// Extension functions are statically resolved
// Extension functions can be added to any class
// functions can be declared inside any file and are called top level functions
// @file:JvmName("MyClassName")
// @JvmField val myJvmField = "String" create jvm field of property to be used from java
// @JvmOverloads creates overloaded versions of a function with default params
// @JvmName("myJvmFunction") // changes name of a kotlin function to  myJvmFunction to be used from java
// @Throws(NullPointerException::class) // specifies when a kotlin function throws exception
// as keyword can be used for type casting. A ? after as (as?) can be used for safe typecasting
// interface keyword can be used to declare interfaces. interfaces can have default functions. default functions in interfaces can be overridden
// Using interface name in <> we can call a function from a specific interface while implementing multiple interfaces
// Using :ClassName() we can inherit classes
// Only classes with open keyword can be inherited
// Only functions with open keyword can be overridden when inheriting from a class
// functions with final keyword can't be overridden
// high order functions are function which take functions as param
// using vararg we can declare functions with n arguments
// functions in kotlin can have default values as well as they can be provided name params while calling them
// constants can be declared inside object class using val keyword
// we can declare abstract class and abstract function using abstract keyword
// closures are when lambda function can use variables declared inside functions
// for a custom setter we can use field = newValue to update backing field with new value
// const keyword can be used to declare fields in kotlin which can be used from java
// Using ClassKt.extension(instance) we can create extension functions from java
// Java nullable types become platform types in kotlin
// Kotlin has set of immutable and mutable interfaces on top of java collections
// if a lambda function takes only one value, `it` can be used inside lambda to access the value provided

