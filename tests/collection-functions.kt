package tests

fun main() {
    testFilter() // prints [1, 2, 3] -- [3, 4] -- [3]
    testAny() // prints true -- false 
    testMap() // prints [2, 4, 6, 8]
    testFlatMap() // prints [[Andre, Pelizoni, Marcelo], [Juliana, Lais]] -- [Andre, Pelizoni, Marcelo, Juliana, Lais]
}

fun testFilter() {
    val mySet: Set<Int> = setOf(1, 2, 3, 4)

    // filter() is not only applied to a set, ok?

    print(
        mySet.filter({
            x -> x < 4
        })
    )

    print(" -- ")

    // More short, using the keyword 'it'
    print(
        mySet.filter({
            it > 2
        })
    )

    print(" -- ")

    // IN THIS CASE you don't need the parenthesis
    print(
        mySet.filter{
            it == 3
        }
    )

    print(" ** ")
}

fun testAny() {
    val myList: List<Int> = listOf(1, 2, 3, 4)

    // any() is not only applied to a list, ok?

    print(
        myList.any({
            it > 2
        })
    )

    print(" -- ")    

    print(
        myList.any({
            it < -1
        })
    )

    print(" ** ")    
}

fun testMap() {
    val mySet: Set<Int> = setOf(1, 2, 3, 4)

    // map() is not only applied to a set, ok?

    print(
        mySet.map({
            it * 2
        })
    )

    print(" ** ")
}

fun testFlatMap() {
    val menProgrammers = listOf("Andre", "Pelizoni", "Marcelo")
    val womenProgrammers = listOf("Juliana", "Lais")

    val programmers = listOf(menProgrammers, womenProgrammers)
    
    // 2 dimensions
    val mapProgrammers = programmers.map({it})

    // 1 dimension - flat 
    val flatMapProgrammers = programmers.flatMap({it})

    print(mapProgrammers)
    print(" -- ")
    print(flatMapProgrammers)
}