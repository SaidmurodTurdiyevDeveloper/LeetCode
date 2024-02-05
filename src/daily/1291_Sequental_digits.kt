package daily

fun sequentialDigits(low: Int, high: Int): List<Int> {
    val lowSize = low.toString().length
    val highSize = high.toString().length
    val startNumber = low.toString().first().digitToInt()
    var number: Int
    var startIndex: Int
    val ls = ArrayList<Int>()
    for ((k, i) in (lowSize..highSize).withIndex()) {
        startIndex = if (i == lowSize) startNumber else 1
        while (startIndex + lowSize + k <= 10) {
            number = startIndex
            for (j in 1 until lowSize + k) {
                number *= 10
                number += j + startIndex
            }
            if (number in low..high) {
                ls.add(number)
                startIndex++
            } else if (number < low) {
                startIndex++
            } else
                startIndex = 10
        }
    }
    return ls
}