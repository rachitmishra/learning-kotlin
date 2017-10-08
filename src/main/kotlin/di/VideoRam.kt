package di

open class VideoRam(val mSize: Int)

data class Ddr5VideoRam(private val size: Int) : VideoRam(size)
