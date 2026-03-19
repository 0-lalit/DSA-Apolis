package Arrays.Mar_16
//Find the second smallest number from the array.

fun secondSmallest(arr: IntArray): Int {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE

    for (num in arr) {
        if (num < first) {
            second = first
            first = num
        }
        else if (num < second && num != first) {
            second = num
        }
    }

    return second
}

fun main() {
    val arr = intArrayOf(5222,343,46,432,21)
    println("${secondSmallest(arr)}")
}