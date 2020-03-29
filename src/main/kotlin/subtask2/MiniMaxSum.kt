package subtask2

class MiniMaxSum {

    // Task 2: MiniMaxSum
    fun getResult(input: IntArray): IntArray {
        var sumArray = arrayOf<Int>()
        for(i in input.indices)
        {
            val array = (input.take(i) + input.takeLast(input.size - i - 1)).also {
                sumArray += it.sum()
            }
        }
        return intArrayOf(sumArray.min()!!, sumArray.max()!!)
    }
}
