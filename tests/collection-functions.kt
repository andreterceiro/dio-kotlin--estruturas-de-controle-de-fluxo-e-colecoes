package tests

fun main() {
    testFilter()
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
    
}