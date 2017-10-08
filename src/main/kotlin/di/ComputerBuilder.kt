package di

import javax.inject.Inject

class ComputerBuilder {
    @Inject lateinit var computer: Computer
}

fun main(args: Array<String>) {
    val computerFactory = DaggerComputerFactory.builder().build()
    val computer = computerFactory.getComputer()
}
