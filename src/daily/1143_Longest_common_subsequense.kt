package daily


fun longestCommonSubsequence(text1: String, text2: String): Int {

    val minimum = if (text1.length > text2.length) text2 else text1
    val maximum = if (text1.length > text2.length) text1 else text2
    val map = Array(maximum.length) {
        Array(minimum.length) {
            0
        }
    }
    for (i in 0 until maximum.length) {
        var lastMax = 0
        for (j in 0 until minimum.length) {
            if (i == 0) {
                if (maximum[i] == minimum[j]) {
                    map[i][j] = 1
                }
            } else {
                if (maximum[i] == minimum[j]) {
                    if (lastMax < minimum.length)
                        map[i][j] = lastMax + 1
                    else
                        map[i][j] = lastMax

                } else {
                    map[i][j] = map[i - 1][j]
                }
                if (map[i][j] > lastMax) {
                    lastMax = map[i][j]
                }
            }
        }
    }
    println(map.last().toList())
    var max = 0
    map.last().forEach {
        if (it > max) {
            max = it
        }
    }
    return max
}