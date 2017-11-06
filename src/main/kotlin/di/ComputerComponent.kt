package di

import dagger.Component

@Component(modules = arrayOf(ComputerModule::class, ComputerBinding::class))
interface ComputerComponent {

}
