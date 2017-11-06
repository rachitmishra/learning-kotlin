package di.dependencies

interface Motherboard

data class Gigabyte(private val processor: Cpu,
                    private val ram: Ram,
                    private val vRam: VideoRam) : Motherboard
