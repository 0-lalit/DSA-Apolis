//Quick sort        Input: [10,7,8,9,1,5]        Output: [1,5,7,8,9,10]

fun quickSort(arr: IntArray, low: Int, high: Int){

    if(low < high){
        val pivot = arr[high]

        var i = low - 1

        for(j in low until high){

            if(arr[j] < pivot){
                i++

                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        val temp = arr[i+1]
        arr[i+1] = arr[high]
        arr[high] = temp

        val pi = i + 1

        quickSort(arr, low, pi-1)
        quickSort(arr, pi+1, high)
    }
}

fun main() {
    val arr6 = intArrayOf(10,7,8,9,1,5)
    quickSort(arr6,0,arr6.size-1)
    println("Quick Sort: " + arr6.joinToString())
}