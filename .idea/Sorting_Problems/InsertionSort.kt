//Insertion sort        Input: [12,11,13,5,6]        Output: [5,6,11,12,13]

fun insertionSort(arr: IntArray): IntArray {

    for(i in 1 until arr.size){
        val key = arr[i]
        var j = i-1

        while(j >= 0 && arr[j] > key){

            arr[j+1] = arr[j]
            j--
        }
        arr[j+1] = key
    }
    return arr
}


fun main() {
    val arr3 = intArrayOf(12,11,13,5,6)
    println("Insertion Sort: " + insertionSort(arr3).joinToString())
}