package other

import kotlin.math.abs

fun divide(dividend: Int, divisor: Int): Int {
    if (abs(dividend) < abs(divisor) && dividend != Int.MIN_VALUE)
        return 0
    if (dividend == divisor)
        return 1
    val isMfd = dividend > 0
    val isMsd = divisor > 0
    if (isMsd && isMfd) {
        if (divisor == 1)
            return dividend
        var count = 0
        var temp = dividend
        while (temp >= divisor) {
            temp -= divisor
            count++
        }
        return count
    } else if (isMsd) {
        if (divisor == 1)
            return dividend
        var count = 0
        var temp = dividend
        while (temp <= 0) {
            temp += divisor
            count--
        }
        return count + 1
    } else if (isMfd) {
        var count = 0
        if (divisor == Int.MIN_VALUE)
            return 0
        var temp = dividend
        val d = abs(divisor)
        while (temp >= d) {
            temp -= d
            count--
        }
        return count
    } else {
        var count = 0
        if (divisor == -1) {
            if (dividend == Int.MIN_VALUE)
                return Int.MAX_VALUE
            else abs(dividend)
        }
        var temp = dividend
        while (temp <= divisor) {
            temp -= divisor
            count++
        }
        return count
    }
}