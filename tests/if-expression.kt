package tests

fun main() {
    print(max(100, 99))
    print("---")
    print(max(99, 100))    
}

fun max(a: Int, b: Int) = if (a > b) a else b
