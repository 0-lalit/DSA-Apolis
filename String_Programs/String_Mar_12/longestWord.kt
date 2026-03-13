//Find the word with the longest length in the given sentence.

fun longestWord(sentence: String): String {

    var words = sentence.split(" ")
    var longest = ""

    for (word in words) {

        if (word.length > longest.length) {
            longest = word
        }
    }

    return longest
}

fun main() {

    var sentence = "Android development is interesting"
    var result = longestWord(sentence)

    println("Longest word = $result")
}