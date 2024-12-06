package tests

fun main() {
    val myMap = mutableMapOf(1 to 100, 2 to "x", 3 to 80, "a" to 60)
    print(myMap)
    print(" -- ")
    myMap[1] = 0
    print(myMap)
}

