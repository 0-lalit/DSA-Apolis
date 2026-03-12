//Check if a Given String is Palindrome or not without finding the reverse of the string.
fun palindrome(str:String): Boolean {
    var last =str.length -1

    for (i in 0 until str.length/2) {
        if(str[i] != str[last]){
            return false
        }
        last--
    }
    return true
}

fun main() {
    print("Enter the string: ")
    val str =readln()
    println("Is $str palindrome: ${palindrome(str)}")
}