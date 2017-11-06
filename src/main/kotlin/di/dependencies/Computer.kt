package di.dependencies

data class Computer(private val cpu: Cpu,
                    private val ram: Ram,
                    private val gRam: VideoRam,
                    private val psu: Psu,
                    private val motherboard: Motherboard)
