//Merge sort        Input: [38,27,43,3,9]        Output: [3,9,27,38,43]

fun mergeSort(arr: IntArray): IntArray {

    if(arr.size <= 1){
        return arr
    }
    val mid = arr.size / 2

    val left = mergeSort(arr.sliceArray(0 until mid))
    val right = mergeSort(arr.sliceArray(mid until arr.size))

    val result = IntArray(left.size + right.size)

    var i = 0
    var j = 0
    var k = 0

    while(i < left.size && j < right.size){

        if(left[i] < right[j]){
            result[k] = left[i]
            i++
        }else{
            result[k] = right[j]
            j++
        }
        k++
    }

    while(i < left.size){
        result[k] = left[i]
        i++
        k++
    }

    while(j < right.size){
        result[k] = right[j]
        j++
        k++
    }

    return result
}

fun main() {
    val arr4 = intArrayOf(38,27,43,3,9)
    println("Merge Sort: " + mergeSort(arr4).joinToString())

}