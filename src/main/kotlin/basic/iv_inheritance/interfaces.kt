package basic.iv_inheritance

/**
 *  Interfaces
 */

interface Interface1 {
    fun printSelf() {
        println("From interface 1")
    }
}

interface Interface2 {
    fun printSelf() {
        println("From interface 2")
    }
}

class InterfaceImpl : Interface1, Interface2 {
    override fun printSelf() {
        println("From InterfaceImpl")
        super<Interface1>.printSelf() // Using interface name in <> we can call a function from a specific interface
    }
}

fun main(arg: Array<String>) {
    val interfaceImpl = InterfaceImpl()
    interfaceImpl.printSelf()
}
