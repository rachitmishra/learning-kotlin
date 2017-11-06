package di.dependencies

open class Ram(val mSize: Int)

data class Ddr5Ram(private val size: Int) : Ram(size)

