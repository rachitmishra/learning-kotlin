package basic.iii_classes

/**
 * Enums
 */

enum class Version {
    ONE,
    TWO,
    THREE
}

enum class VersionWithProperty(val id: Int) {
    ONE(1) {
        override fun text(): String {
            return "Wohoooo!"
        }

        override fun toString(): String {
            return "This is one"
        }
    };

    abstract fun text(): String // add a member function to all the enums
}

fun main(arg: Array<String>) {
    val version = Version.ONE
    println(version)
    println(version.ordinal) // Print position of enum
    println(version.name) // Print name of enum

    for (ver in VersionWithProperty.values()) {
        println(ver)
    }

    val version2 = VersionWithProperty.valueOf("ONE")
    println(version2)
    println(version2.text())
}
