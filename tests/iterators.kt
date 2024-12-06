package tests

class Animal(val type: String) {
    override fun toString(): String {
        return type
    }
}

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("Lion"), Animal("Tiger"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("$animal")
    }
}

