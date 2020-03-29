package subtask4

class StringParser {

    // Task 4: StringParer
    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        var none = 0
        for (i in inputString.withIndex()) {
            if (i.value == '<' || i.value == '[' || i.value == '(') {
                var end: Char = when (i.value) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (i2 in i.index + 1 until inputString.length) {
                    if (inputString[i2] == i.value) none++
                    if (inputString[i2] == end) {
                        if (none == 0) {
                            result.add(inputString.substring(i.index + 1 until i2))
                        } else none--
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}