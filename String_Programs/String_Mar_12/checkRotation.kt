//Check if strings are rotations of each other or not

fun checkRotation(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    var temp = str1 + str1
    return temp.contains(str2)
}

fun main() {

    var str1 = "ABCD"
    var str2 = "CDAB"

    if (checkRotation(str1, str2)) {
        println("Strings are rotations of each other")
    } else {
        println("Strings are not rotations")
    }
}