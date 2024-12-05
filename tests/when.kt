package tests

fun main() {
    val feedback = 4;
    when (feedback) {    
        1 -> println("Sorry. How can we improve?")
        2 -> println("ok. How can we improve?")
        3 -> println("Thanks!")
        else -> println("I do not know this rate")
    }
}