//Count the number of occurrences of each char in the input string.

fun occurence (str: String): Unit {
    var map = mutableMapOf<Char,Int>()
    for (i in str){
        map[i]= (map[i] ?:0) + 1
    }
    for ((key,value)in map){
        println("$key = $value")
    }
}

fun main() {
    print("Enter the string: ")
    val str =readln()
    occurence(str)
}