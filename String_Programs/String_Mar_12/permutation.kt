// Print all permutations of a given string

fun permutation(str: String, ans: String) {

    if (str.length == 0) {
        println(ans)
        return
    }

    for (i in str.indices) {
        var ch = str[i]
        var left = str.substring(0, i)
        var right = str.substring(i + 1)

        var remaining = left + right
        permutation(remaining, ans + ch)
    }
}

fun main() {

    var str = "ABC"
    permutation(str, "")
}