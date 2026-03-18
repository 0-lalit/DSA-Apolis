package String_Programs.String_Mar_13

fun removeConsecutiveDuplicates(input: String): String {

    val result = StringBuilder()

    for (i in input.indices) {

        if (i == 0) {
            result.append(input[i])
        } else {
            if (input[i] != input[i - 1]) {
                result.append(input[i])
            }
        }
    }
    return result.toString()
}

fun main() {
    val input = "ssuuppperrrrr coooommpuuuuuuuuttttter"
    println("Input: $input")

    val output = removeConsecutiveDuplicates(input)
    println("Output: $output")
}