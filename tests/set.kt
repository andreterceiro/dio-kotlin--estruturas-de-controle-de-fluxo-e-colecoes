package tests

fun main() {
    var someList: Set<Int> = setOf(50,1,3)
    print(someList)
    print(" - ")
    print(someList[0]) // Error - not fatal, ok, but an error printed in the screen
    print(" - ")
    print(someList)
}
