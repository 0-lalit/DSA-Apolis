
fun areAnagramMap(s1: String, s2: String): Boolean {

    if (s1.length != s2.length) {
        return false
    }

    val map = HashMap<Char, Int>()
    for (ch in s1) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    for (ch in s2) {

        if (!map.containsKey(ch)) {
            return false
        }

        map[ch] = map[ch]!! - 1
        if (map[ch] == 0) {
            map.remove(ch)
        }
    }

    return map.isEmpty()
}

fun main() {
    val str1 = "listen"
    val str2 = "silent"

    if (areAnagramMap(str1, str2)) {
        println("Strings are anagrams")
    } else {
        println("Strings are NOT anagrams")
    }
}