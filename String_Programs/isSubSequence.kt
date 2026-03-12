fun longestCommonSubsequence(list: List<String>): String {
    var first = list[0]
    var longest = ""

    for (i in 0 until first.length) {

        for (j in i + 1..first.length) {
            var sub = first.substring(i, j)
            var common = true

            for (k in 1 until list.size) {
                if (!list[k].contains(sub)) {
                    common = false
                    break
                }
            }

            if (common && sub.length > longest.length) {
                longest = sub
            }
        }
    }
    return longest
}

fun main() {
    var list = listOf("flower", "flow", "flight")
    var result = longestCommonSubsequence(list)

    println("Longest common subsequence: $result")
}