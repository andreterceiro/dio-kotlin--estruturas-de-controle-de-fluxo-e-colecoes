# General


## When statement


### When as a statement

Is simpe, see this code and you will understand

```kotlin
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
```

### When as an expression


## Verifying types - is

```kotlin
package tests

fun main() {
    if ("hi" is String) {
        print ("hi is a string")
    } else {
        print ("hi is not a string")
    }
}
```

## Any - any type

[Please see here](https://pl.kotl.in/gM0GHOkMQ"). Easy to understand. any = any type