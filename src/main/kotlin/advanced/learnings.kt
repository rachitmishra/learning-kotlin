/**
 * Learning(s)
 */

// infix works when infix notation is used works with extension function or member functions with single parameter
// operator keywords lets us overload operators
// multiple return statement in anonymous functions gives us flexibility for multiple return point
// inline keyword inlines the high order function/lambda and lambdas passed to it to where it is called
// Inlinable lambdas can only be called inside the inline functions or passed as inlinable arguments
// extension functions have access to member/properties of class
// non local returns(returning from main function) only allowed from inline functions (functions annotated with inline keyword)
// lambda don't do a local return or do with help of labels, anonymous functions do have local returns
// using return@label we can return to a specific label from lambda
// tailrec keyword tells the compiler that the function is using tail recursion, and the compiler uses goto (see bytecode) instead of recursion, helping us in tail call optimization
// implementing `invoke` operator let's us invoke/make a class object do something just by calling it's instance
// backing field is generated for a property
// using `lateinit` modifier we can tell the compiler that we are going to initialize this property laters just before we use it
// Using private the nested class becomes encapsulated
// Using `inner` the nested class becomes inner class and can access properties from outer class
// Using this@OuterClass we can access member of outer class with same name
// using `private` visibility specifier we can hide a constructor, whenever using visibility specifiers or access specifiers we need to use `constructor` keyword for the primary constructor
// using `sealed` only specified classes can inherit from sealed class
// The ability to mark a class as sealed, enables us to use these as a way in which we can define Algebraic Data Types
// anything inheriting from a sealed class has to put in same file. sealed classes has to be found in same file
// Sealed classes are used for representing restricted class hierarchies, when a value can have one of the types from a limited set, but cannot have any other type.
// The best use of sealed classes is in when statements where we can cover all types/sub classes of sealed classes, and so no else block is required in when
// using `typealias` we can alias any type to a custom type eg. typealias Name = String
// the `by` keyword helps us in delegating functions from dependencies
// The by-clause in the supertype list for host class indicates that delegating param will be stored internally in objects of host class and the compiler will generate all the methods of delegated class that forward to delegated param.
// Using @JvmStatic we can access this function statically through java
// delegating properties requires us to implement setValue and getValue
// we can also add extension properties, extension properties don't have backing fields, companion objects can have extension properties
// Using :BaseClass we have put upperbound restriction on generic type T
// To put multiple restriction we will write as <T> where T:type, T:OtherType
// In kotlin default type restriction is Any?, which we can change to Any
// We can also put type restrictions on functions as fun <T : UpperBound> myFunction
// using a immutable interface we can pass subtype, this is called invariance
// We use `out` modifier to indicate covariance (similar to ? extends T) at declaration site rather than at use site
// using `out` modifier we respect the covariance of type
// We use `in` modifier to indicate contravariance (similar to ? super T) at declaration site rather than at use site
// element of generic type *
// `reified` Avoids type erasure and preserves the type
