package tests

fun main() {
    var someSet1: Set<Int> = setOf(50, 1, 3, 50)
    print(someSet1) // [50 , 1 , 3]
    print(" - ")
    // print(someSet1[0]) // Error
    print(" - ")
    print(someSet1) // [50 , 1 , 3]

    print(" ########################### ")

    val someSet2: MutableSet<Int> = mutableSetOf(50,1,3)
    print(someSet2)
    print(" - ")

    someSet2.add(40) // how to add an element to a set
    print(someSet2)
}
