package scratchpad

fun main(args: Array<String>) {
    val person = Person("Nexus")
    
    val ageInWords = with(person) {
        print()
        println(age)
        getAgeInWords()
    }
    println(ageInWords)
    
    val person2 = person.apply {
        print()
    }
    
    person2.name = "Alex"
    person2.print()
    
    person?.let {
        println(it.name)
    }
    
    person.run {
        name = "Rachit"
        println(name)
    }
    
}

class Person(var name: String, val age: Int = 0) {
    fun print() = println(name)
    fun getAgeInWords() = age.toString()
    
    operator fun invoke(ob: Person.() -> Unit) {
    
    }
}
