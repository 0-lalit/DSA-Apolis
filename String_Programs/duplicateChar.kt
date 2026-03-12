//Print all the duplicate chars in the input string.

fun duplicateChars(str: String) {
    var map = mutableMapOf<Char, Int>()

    for (i in str) {
        map[i] = (map[i] ?: 0) + 1
    }

    for ((key, value) in map) {
        if (value > 1) {
            println("$key appears $value times")
        }
    }
}

fun main() {
    var str = "programming"
    duplicateChars(str)
}