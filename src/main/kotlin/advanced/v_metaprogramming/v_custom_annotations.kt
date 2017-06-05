package advanced.v_metaprogramming

/**
 * Custom annotations
 */

@Target(AnnotationTarget.CLASS)
annotation class Table(val name:String)

@Target(AnnotationTarget.PROPERTY) // This specifies/restricts where an annotation class can be used
@Retention // Retain information at runtime
@Repeatable // Annotation can be repeated
@MustBeDocumented // Annotation can be shown in documentation
annotation class Field(val name:String) // Creating a new annotation class

@Table(name = "contact")
//@Field("id") // this is an error as annotation class field targets Property
data class Contact(@Field("id") val id: Int, @Field("name") val name: String, @Field("email") val email:String)

fun main(args: Array<String>) {
    val myAnnotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }
    println(myAnnotation)
}
