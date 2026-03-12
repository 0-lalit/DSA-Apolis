//Find the most recurring char in the input string.

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

fun main() {
    println("Most Occuring Char: ${mostOccuring("programmingggggg)}")
}
