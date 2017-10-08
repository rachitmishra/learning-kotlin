package di

import dagger.Module
import dagger.Provides

@Module
open class ComputerModule(private val memorySize: Int,
                          private val vMemorySize: Int,
                          private val powerSize: Int) {
    
    @Provides
    fun providesCpu(): Cpu = CpuX64()
    
    @Provides
    fun providesRam(): Ram = Ddr5Ram(memorySize)
    
    @Provides
    fun providesPowerSupply(): Psu = Psu(powerSize)
    
    @Provides
    fun providesMotherboard(cpu: Cpu, ram: Ram, vRam: VideoRam): Motherboard = Gigabyte(cpu, ram, vRam)
    
    @Provides
    fun providesGraphicRam(): VideoRam = Ddr5VideoRam(vMemorySize)
    
    @Provides
    fun providesComputer(motherboard: Motherboard, psu: Psu): Computer =
            Computer(motherboard.mProcessor, motherboard.mRam, motherboard.mVideoRam, psu, motherboard)
}
