package tests

fun main() {
    val someList1: List<Int> = listOf(50,1,3)
    print(someList1)
    print(" - ")
    print(someList1[0])
    print(" - ")

    // someList1[0] = 1 // ERROR - You need a mutable list
    // sort(someList) // ERROR - intArray as example can be sorted with this function
    // print(someList1)

    val someList2: MutableList<Int> = mutableListOf(50,1,3)
    print(someList2)
    print(" - ")
    print(someList2[0])
    print(" - ")

    someList2[0] = 1
    print(someList2)
}