package di

import dagger.Component

@Component(modules = arrayOf(ComputerModule::class))
interface ComputerComponent {
    fun getComputer(): Computer
}
