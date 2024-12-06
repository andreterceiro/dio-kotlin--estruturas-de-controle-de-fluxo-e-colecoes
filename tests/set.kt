package tests

fun main() {
    var someList: Set<Int> = setOf(50, 1, 3, 50)
    print(someList) // [50 , 1 , 3]
    print(" - ")
    print(someList[0]) // Error - not fatal, ok, but an error printed in the screen
    print(" - ")
    print(someList) // [50 , 1 , 3]
}
