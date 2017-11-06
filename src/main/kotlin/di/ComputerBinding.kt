package di

import dagger.Binds
import dagger.Module
import dagger.Provides
import di.dependencies.*

@Module
abstract class ComputerBinding(private val memorySize: Int,
                               private val vMemorySize: Int) {
    @Binds
    abstract fun providesMotherboard(gigabyte: Gigabyte): Motherboard
}
