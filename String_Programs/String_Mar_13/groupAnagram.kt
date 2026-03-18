package String_Programs.String_Mar_13

fun groupAnagrams(words: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    for (word in words) {

        val key = word.toCharArray().sorted().joinToString("")

        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }

        map[key]?.add(word)
    }
    val result = mutableListOf<List<String>>()

    for (group in map.values) {
        if (group.size > 1) {
            result.add(group)
        }
    }
    return result
}

fun main() {
    val words = arrayOf("act", "race", "listen", "silent", "hello", "cat", "tac")

    val result = groupAnagrams(words)
    print(result)

}