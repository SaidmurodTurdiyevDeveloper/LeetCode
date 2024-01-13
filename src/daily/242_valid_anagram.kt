package daily

/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */
fun main() {
    val ls = isAnagram("bb", "ac")
    println(ls)
}
//first
//fun isAnagram(s: String, t: String): Boolean {
//    if(s.length!=t.length)
//        return false
//
//    return s.toCharArray().also { it.sort() }.contentEquals(t.toCharArray().also { it.sort() })
//}
//second
fun isAnagram(s: String, t: String): Boolean {
    if(s.length!=t.length)
        return false
    val result=Array(27){
        0
    }
    for (i in s.indices){
        result[s[i]-'a']+=1
        result[t[i]-'a']-=1
    }
    for (i in result){
        if (i!=0)
            return false
    }
    return true
}