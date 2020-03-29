package subtask3

class BillCounter {

    // Task 3: BillCounter
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val array = bill.take(k) + bill.takeLast(bill.size - k - 1)
        val bill = array.sum() / 2
        if (bill == b) {
            return "Bon Appetit"
        } else
            return (b - bill).toString()
    }
}