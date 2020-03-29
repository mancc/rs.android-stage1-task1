package subtask1

class HappyArray {

    // Task 1: HappyArray

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty())
            return intArrayOf()
        var array: Int
        var tmpArray = arrayOf<Int>()
        var resultArray = arrayOf<Int>()
        sadArray.forEach { tmpArray += it }
        tmpArray.filter { i -> i > 2 }
        var isArrayHappy: Boolean = false
        do {
            resultArray = arrayOf<Int>()
            resultArray += tmpArray[0]
            for (i in 1 until tmpArray.size - 1) {
                if (tmpArray[i] <= tmpArray[i - 1] + tmpArray[i + 1]) {
                    resultArray += tmpArray[i]
                }
            }
            resultArray += tmpArray[tmpArray.size - 1]
            if (tmpArray.size == resultArray.size) {
                isArrayHappy = true
            } else {
                tmpArray = resultArray
            }
        } while(!isArrayHappy)
        return IntArray(resultArray.size){ idx-> resultArray[idx]}

    }
}