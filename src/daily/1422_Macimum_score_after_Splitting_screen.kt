package daily

fun main() {
    val result = maxScore("1011011")
    println(result)
}

fun maxScore(s: String): Int {
    var oneCount = 0
    for (i in 1 until s.length) {
        if (s[i] == '1')
            oneCount++
    }
    var zeroCount = 0
    if (s[0] == '0')
        zeroCount += 1
    var max = zeroCount + oneCount
    for (i in 1 until s.length - 1) {

        if (s[i] == '0') {
            zeroCount++
        } else {
            oneCount--
        }
        if (zeroCount + oneCount > max) {
            max = zeroCount + oneCount
        }

    }
    return max
}