//Remove characters from the first string which are present in the second string

fun removeChars(str1: String, str2: String): String {
    var result = ""
    for (c in str1) {
        var found = false
        for (d in str2) {
            if (c == d) {
                found = true
                break
            }
        }
        if (!found) {
            result = result + c
        }
    }
    return result
}

fun main() {
    var str1 = "hello"
    var str2 = "el"
    var result = removeChars(str1, str2)

    println(result)
}