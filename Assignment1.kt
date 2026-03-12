fun main() {
    val arr1 = intArrayOf(29,10,14,37,13)
    val arr2 = intArrayOf(5,1,4,2,8)
    val arr3 = intArrayOf(12,11,13,5,6)
    val arr4 = intArrayOf(38,27,43,3,9)
    val arr5 = intArrayOf(3,2,1)
    val arr6 = intArrayOf(10,7,8,9,1,5)

    println("Selection Sort: " + selectionSort(arr1).joinToString())
    println("Bubble Sort: " + bubbleSort(arr2).joinToString())
    println("Insertion Sort: " + insertionSort(arr3).joinToString())
    println("Improved Bubble Sort: " + improvedBubbleSort(arr5).joinToString())
    println("Merge Sort: " + mergeSort(arr4).joinToString())

    quickSort(arr6,0,arr6.size-1)
    println("Quick Sort: " + arr6.joinToString())
}


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
