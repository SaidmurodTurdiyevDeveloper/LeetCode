package daily

import kotlin.math.pow

fun sumSubarrayMins(arr: IntArray): Int {
    var sum = 0
    val max = (10.0.pow(9.0) + 7).toInt()
    for (i in 0 until arr.size) {
        var minimum = arr[i]
        for (j in i until arr.size) {
            if (minimum > arr[j]) {
                minimum = arr[j]
            }

            if ((minimum + sum) > max)
                sum -= max
            sum += minimum
        }
    }
    return sum
}
