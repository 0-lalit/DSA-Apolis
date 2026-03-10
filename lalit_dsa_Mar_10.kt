fun main() {
    print("Enter the string: ")
    val str =readln()
    println("Is $str palindrome: ${palindrome(str)}")
    occurence(str)
    println("Most Occuring Char: ${mostOccuring(str)}")

    println("Duplicate Removed: ${removeDuplicates(str)}  ")
}

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

fun occurence (str: String): Unit {
    var map = mutableMapOf<Char,Int>()
    for (i in str){
        map[i]= (map[i] ?:0) + 1
    }
    for ((key,value)in map){
        println("$key = $value")
    }
}

fun mostOccuring(str: String): Char {
    val map = mutableMapOf<Char,Int>()
    for (i in str){
        map[i] = (map[i]?:0) + 1
    }
    var max =0
    var char =' '
    for ((key,value) in map){
        if(value>max){
            max = value
            char= key
        }
    }
    return char
}

fun removeDuplicates (str: String): StringBuilder {
    var result = StringBuilder()
    val set = mutableSetOf<Char>()
    for (i in str){
        if(!set.contains(i)){
            result.append(i)
        }
        set.add(i)
    }
    return result
}
