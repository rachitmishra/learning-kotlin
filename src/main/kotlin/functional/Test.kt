package functional

import java.util.TreeSet

class Test {
    val ngrams = TreeSet(setOf(
            NGram("whatever"),
            NGram("a very common thing", 3),
            NGram("a very common phrase", 2),
            NGram("a very good call", 1),
            NGram("welcome to the", 0),
            NGram("welcome to my", 0)
    ))
    
    fun pairs() {
//        assertEquals(listOf("he", "el", "ll", "lo"), "hello".pairwise())
    }
    
    fun basics() {
//        assertEquals(listOf("welcome to my"), ngrams.complete("weltm"))
//        assertEquals(listOf("a very common thing", "a very common phrase", "a very good call"), ngrams.complete("a ver"))
//        assertEquals(listOf("a very common thing"), ngrams.complete("a vect"))
    }
}
