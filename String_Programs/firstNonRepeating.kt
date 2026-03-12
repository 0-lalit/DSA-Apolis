//Find first non-repeating character in the string.

fun firstNonRepeating(str: String): Char? {
    var map = mutableMapOf<Char, Int>()

    for (i in str) {
        map[i] = (map[i] ?: 0) + 1
    }

    for (i in str) {
        if (map[i] == 1) {
            return i
        }
    }
    return null
}

fun main() {
    var str = "aabbcdde"
    var result = firstNonRepeating(str)

    println("First Non Repeating Character = $result")
}