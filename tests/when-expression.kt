package tests

fun main() {
    val feedback = 1;
    var result: Any = when (feedback) {    
        1 -> "Sorry. How can we improve?"
        2 -> "ok. How can we improve?"
        3 -> "Thanks!"
        else -> "I do not know this rate"
    }

    print(result)
}