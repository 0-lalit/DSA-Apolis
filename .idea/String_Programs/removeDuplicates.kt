//Remove duplicate chars from the input string.

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

fun main() {
    println("Duplicate Removed: ${removeDuplicates("Aaaattppppp")}  ")

}