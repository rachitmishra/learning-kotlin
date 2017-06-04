package advanced.iii_delegation

/**
 * Extension properties
 */

val String.hasAmpersand: Boolean // string class extended with hasAmpersand property, can't be initialized because it has no backing field
    get() = this.contains("&")

// extension properties can't have backing fields
// companion objects can have extension properties
fun main(args: Array<String>) {

}
