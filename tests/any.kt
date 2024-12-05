package tests

fun main() {
    printer("test")
    printer(123)
} 

fun printer(param: Any) {
    println(param)
}