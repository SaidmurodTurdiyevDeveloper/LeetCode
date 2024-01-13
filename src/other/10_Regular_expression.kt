package other


//first sollution
//fun isMatch(s: String, p: String): Boolean {
//
//    return dp(0, 0, s, p)
//}

//fun dp(i: Int, j: Int, text: String, pattern: String): Boolean {
//    val ans: Boolean
//    if (j == pattern.length) {
//        ans = i == text.length
//    } else {
//        val firstMatch = (i < text.length &&
//                (pattern[j] == text[i] ||
//                        pattern[j] == '.'))
//
//        ans = if (j + 1 < pattern.length && pattern[j + 1] == '*') {
//            dp(i, j + 2, text, pattern) || firstMatch && dp(i + 1, j, text, pattern)
//        } else {
//            firstMatch && dp(i + 1, j + 1, text, pattern)
//        }
//    }
//    return ans
//}

//secodn sollution

fun isMatch(s: String, p: String): Boolean {
    val map = Array(s.length + 1) { i ->
        Array(p.length + 1) { j ->
            i == 0 && j == 0
        }
    }
    for (i in 0..s.length) {
        for (j in 1..p.length) {
            if(p[j-1] == '*'){
                map[i][j]=j>1&&map[i][j-2]||(i>0&&(s[i-1] == p[j-2] || p[j-2] == '.')&&map[i-1][j])
            }
            else{
                map[i][j] = i > 0 && map[i-1][j-1] && (s[i-1] == p[j-1] || p[j-1] == '.')
            }
        }
    }

    return map[s.length][p.length]
}




