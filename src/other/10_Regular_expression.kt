package other

/**
 *
 * 10. Regular Expression Matching
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 *
 * '.' Matches any single character.​​​​
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 *
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * Example 3:
 *
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 *
 */


fun main() {
    val result = isMatch("aaa", "aaaaa")
    println("1 $result false")
    println()
    val result2 = isMatch("aa", "a*")
    println("2 $result2 true")
    println()
    val result3 = isMatch("ab", ".*")
    println("3 $result3 true")
    println()
    val result4 = isMatch("aaa", "ab*a*c*a")
    println("5 $result4 true")
    println()
    val result5 = isMatch("aab", "c*a*b")
    println("6 $result5 true")
    println()
    val result6 = isMatch("abcd", "d*")
    println("7 $result6 false")
    println()

    val result7 = isMatch("ab", ".*c")
    println("8 $result7 false")
    println()

    val result8 = isMatch("aaa", "ab*a")
    println("8 $result8 false")
    println()
}

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




