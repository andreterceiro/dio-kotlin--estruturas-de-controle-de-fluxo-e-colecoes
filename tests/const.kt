package tests
const val v1 = 1;
//const val constant; - Error
//constant = 1 - Error
val v2 = 2
// val v3: Int - ERROR - In top level val must be inititalized
// v3 = 2

fun main() {
    // const val v1 = 1; - Error: constant is not aplicable to a local variable
    val v3: Int
    v3 = 3

    print(v1)
    print(" -- ")
    print(v2)
    print(" -- ")
    print(v3)
}