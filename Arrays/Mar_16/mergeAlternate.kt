package Arrays.Mar_16
//Merge two arrays to form a third array
// e.g. First array: 10, 50, 20, 30, 70, 80, 40
// Second array: 25, 75, 5, 25
// Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40

fun mergeAlternate(a: IntArray, b: IntArray): List<Int> {
    val result = mutableListOf<Int>()

    val max = maxOf(a.size, b.size)

    for (i in 0 until max) {
        if (i < a.size){

            result.add(a[i])
        }
        if (i < b.size){

            result.add(b[i])
        }
    }

    return result
}

fun main() {

    val arr1 = intArrayOf(10, 50, 20, 30, 70, 80, 40)
    val arr2 = intArrayOf(25, 75, 5, 25)

    print("${mergeAlternate(arr1, arr2)}")

}