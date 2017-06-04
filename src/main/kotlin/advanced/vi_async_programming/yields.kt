package advanced.vi_async_programming

import kotlinx.coroutines.experimental.yield

/**
 * Yields
 */

fun main(args: Array<String>) {
    val sequence = 1..10
    sequence.forEach {
        //yield(1)
    }
}
