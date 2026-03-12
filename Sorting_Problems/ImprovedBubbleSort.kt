//Improved bubble sort        Input: [3,2,1]        Output: [1,2,3]


fun improvedBubbleSort(arr: IntArray): IntArray {
    var swapped: Boolean

    for(i in 0 until arr.size-1){
        swapped = false
        for(j in 0 until arr.size-i-1){
            if(arr[j] > arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swapped = true
            }
        }
        if(!swapped){
            break
        }
    }
    return arr
}
fun main() {
    val arr5 = intArrayOf(3,2,1)
    println("Improved Bubble Sort: " + improvedBubbleSort(arr5).joinToString())

}