package functional

import java.util.*
import java.util.Collections.emptyList

data class NGram(val words: String, val freq: Int = -1) : Comparable<NGram> {
    
    override fun compareTo(other: NGram): Int {
        val x = words.compareTo(other.words)
        return if (x != 0 || freq == -1)
            x
        else
            freq.compareTo(other.freq)
    }
}

fun NavigableSet<NGram>.complete(input: String): List<String> {
    return emptyList()
}
