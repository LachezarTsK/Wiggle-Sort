
class Solution {

    fun wiggleSort(input: IntArray): Unit {
        for (i in 1..<input.size step 2) {
            if (input[i - 1] > input[i]) {
                swap(i - 1, i, input)
            }
            if (i + 1 < input.size && input[i + 1] > input[i]) {
                swap(i + 1, i, input)
            }
        }
    }

    private fun swap(first: Int, second: Int, input: IntArray) {
        val temp = input[first]
        input[first] = input[second]
        input[second] = temp
    }
}
