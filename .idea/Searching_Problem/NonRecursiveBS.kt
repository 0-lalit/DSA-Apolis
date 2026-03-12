//Non‑recursive binary search        Input: [1,3,5,7,9], target=7        Output: index 3

fun binarySearch(arr: Array<Int>, target: Int):Int{
    var left = 0
    var right = arr.size - 1
    while (left <= right){
        var mid = (left + right) / 2
        if(arr[mid]== target){
            return mid
        }
        else if(arr[mid] > target){
            right = mid - 1
        }
        else left = mid + 1
    }
    return -1
}

fun main() {
    val arr1 =arrayOf(1,3,5,7,9)
    println("Binary Search Index: ${binarySearch(arr1, 7)}")
}