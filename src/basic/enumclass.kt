package basic

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
    val version = basic.Version.ONE
    println(version)
    println(version.ordinal) // Print position of enum
    println(version.name) // Print name of enum

    for (ver in basic.VersionWithProperty.values()) {
        println(ver)
    }

    val version2 = basic.VersionWithProperty.valueOf("ONE")
    println(version2)
    println(version2.text())
}
