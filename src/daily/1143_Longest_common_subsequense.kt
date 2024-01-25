package daily

import kotlin.math.min

fun longestCommonSubsequence(text1: String, text2: String): Int {
    val temp = if (text1.length > text2.length) text1 else text2
    val s = if (text1.length <= text2.length) text1 else text2
    val minSize = s.length
    var startTempIndex=0
    var count=0
    for (i in 0 until minSize) {
        var j=startTempIndex
        while (j<temp.length){
            if (s[i]==temp[j]){
                startTempIndex=j+1
                count++
            }
            j++
        }
    }
    return count
}