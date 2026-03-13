//Reverse each word in a given string. E.g. input: Android is best output: diordnA si tseb

fun reverseWords(sentence: String): String {

    var words = sentence.split(" ")
    var result = ""

    for (word in words) {

        var rev = ""
        for (i in word.length - 1 downTo 0) {
            rev = rev + word[i]
        }

        result = result + rev + " "
    }

    return result.trim()
}

fun main() {

    var str = "Android is best"
    var result = reverseWords(str)

    println(result)
}