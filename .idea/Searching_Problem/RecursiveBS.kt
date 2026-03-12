//Recursive binary search        Input: [2,4,6,8,10], target=6        Output: index 2

fun recursiveBinarySearch(arr: Array<Int>, target: Int,low: Int,high: Int): Int{
    var mid = (low + high) / 2
    if(low>high){
        return -1
    }
    if(arr[mid] == target){
        return mid
    }
    else if (arr[mid]>target){
        recursiveBinarySearch(arr,target,low,mid-1)
    }
    else recursiveBinarySearch(arr,target,mid+1,high)
    return -1
}

fun main() {
    val arr2 = arrayOf(2,4,6,8,10)
    println("Recursive Binary Search Index: ${recursiveBinarySearch(arr2,6, 0,arr2.size-1)}")

}