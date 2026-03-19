package Arrays.Mar_16

// Find the second largest number from the array.

fun secondLargest(arr: IntArray): Int{
    var largest = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    for (i in arr){
        if (i > largest){
            second =largest
            largest= i
        }
        else if (i > second && i != largest) {
            second = i
        }

    }
    return second
}
fun main() {
    val arr = intArrayOf(5222,343,46,432,21)
    println("${secondLargest(arr)}")
}