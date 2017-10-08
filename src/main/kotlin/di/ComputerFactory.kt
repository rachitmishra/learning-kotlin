package di

import dagger.Component

@Component(modules = arrayOf(ComputerModule::class))
interface ComputerFactory {
    
    fun getComputer(): Computer
}
