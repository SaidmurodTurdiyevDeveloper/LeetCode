package other

import kotlin.math.floor
import kotlin.math.min

fun main() {
    val result= longestCommonPrefix(
        arrayOf(
            "ab","a"
        )
    )
    println(result)
}


fun longestCommonPrefix(strs: Array<String>): String {
    var endText = strs[0].length
    var j = 0
    for (i in 1 until strs.size) {
        j = 0
        if (endText>strs[i].length)
            endText=strs[i].length
        while (j < endText) {
            if (strs[0][j] != strs[i][j]) {
                if (j == 0)
                    return ""
                endText = j
                j = endText
            }
            j++
        }
    }
    return strs[0].substring(0, endText)
}