package di

import di.dependencies.Computer
import javax.inject.Inject

class ComputerApplication {
    @Inject lateinit var computer: Computer
    
    fun print() = computer.toString()
}

fun main(args: Array<String>) {
    val daggerComputerComponent = DaggerComputerComponent.builder().build()
}
