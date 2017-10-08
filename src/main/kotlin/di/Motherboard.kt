package di

open class Motherboard(val mProcessor: Cpu, val mRam: Ram, val mVideoRam: VideoRam)

data class Gigabyte(private val processor: Cpu,
                    private val ram: Ram,
                    private val vRam: VideoRam) : Motherboard(processor, ram, vRam)
