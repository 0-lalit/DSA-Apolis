//Selection sort        Input: [29,10,14,37,13]                      Output: [10,13,14,29,37]

fun selectionSort(arr: IntArray): IntArray {
    for(i in arr.indices){
        var minIndex = i

        for(j in i+1 until arr.size){
            if(arr[j] < arr[minIndex]){
                minIndex = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
    return arr
}
fun main() {
    val arr1 = intArrayOf(29,10,14,37,13)
    println("Selection Sort: " + selectionSort(arr1).joinToString())

}