package di

import javax.inject.Inject

class ComputerApp {
    @Inject lateinit var computer: Computer
}

fun main(args: Array<String>) {
    val computerComponent = DaggerComputerComponent.builder().build()
    val computer = computerComponent.getComputer()
}
