//Bubble sort        Input: [5,1,4,2,8]        Output: [1,2,4,5,8]

fun bubbleSort(arr: IntArray): IntArray {

    for(i in 0 until arr.size-1){
        for(j in 0 until arr.size-i-1){

            if(arr[j] > arr[j+1]){
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    return arr
}

fun main() {
    val arr2 = intArrayOf(5,1,4,2,8)
    println("Bubble Sort: " + bubbleSort(arr2).joinToString())

}