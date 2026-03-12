//implement linear search        Input: [4,2,7,1,9], target=7        Output: index 2

fun linearSearch(arr: Array<Int>, target: Int): Int {
    for (i in 0 until arr.size ) {
        if(arr[i]== target) return i
    }
    return -1
}

fun main() {
    val arr = arrayOf(4,2,7,1,9)
    println("Linear Search index: ${linearSearch(arr, 7)}")
}