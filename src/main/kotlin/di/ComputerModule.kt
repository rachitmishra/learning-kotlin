package di

import dagger.Module
import dagger.Provides
import di.dependencies.*
import javax.inject.Named

@Module
abstract class ComputerModule(private val memorySize: Int,
                              private val vMemorySize: Int) {
    
    @Provides
    fun providesRam(): Ram = Ddr5Ram(memorySize)
    
    @Provides
    @Named("large")
    fun providesLargeGraphicRam(): VideoRam = Ddr5VideoRam(vMemorySize)
    
    @Provides
    fun providesGraphicRam(): VideoRam = Ddr5VideoRam(vMemorySize)
    
    @Provides
    fun providesMotherBoardWithLargeVideoRam(
            processor: Cpu, ram: Ram, @Named("large") videoRam: VideoRam): Gigabyte
            = Gigabyte(processor, ram, videoRam)
    
    @Module
    companion object {
        
        @Provides
        @JvmStatic
        fun providesPowerSupply(): Psu = Psu()
    }
}
