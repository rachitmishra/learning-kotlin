package basic.viiii_std_library

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Track> = listOf())

data class Track(val title: String, val durationInSeconds: Int)

val albums = listOf(
        Album("The Dark Side of the Moon", 1973, 2, 1,
                listOf(Track("Speak to Me", 90),
                        Track("Breathe", 163),
                        Track("On he Run", 216),
                        Track("Time", 421),
                        Track("The Great Gig in the Sky", 276),
                        Track("Money", 382),
                        Track("Us and Them", 462),
                        Track("Any Color You Like", 205),
                        Track("Brain Damage", 228),
                        Track("Eclipse", 123)
                )),
        Album("The Wall", 1979, 3, 1),
        Album("Wish You Were Here", 1975, 1, 1))

fun albumLessThan(duration: Int, albums: List<Album>): List<Pair<String, String>> {
    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds < duration
        }.map {
            Pair(it.title, albumTitle)
        }
    }
}

fun main(args: Array<String>) {
    
    albums.forEach {
        if (it.chartUK == 1) println(it.title)
    }
    
    albums.filter { it.chartUK == 1 } // function pipelining
            .forEach { val titles = mutableListOf<String>(); titles.add(it.title) } // function pipelining
    
    
    val titles = albums.filter { it.chartUK == 1 }.map { Pair(it.title, it.year) }
    println(titles)
    
    albumLessThan(200, albums).forEach {
        println("${it.first} ${it.second}")
    }
}
