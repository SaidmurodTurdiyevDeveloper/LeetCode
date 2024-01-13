package daily

/**
 * 1220. Count Vowels Permutation
 *
 * Hard
 *
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 *
 * Each character is a lower case vowel ('a','e','i','o','u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 5
 * Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
 * Example 2:
 *
 * Input: n = 2
 * Output: 10
 * Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
 * Example 3:
 *
 * Input: n = 5
 * Output: 68
 */

fun main(){
    val result=countVowelPermutation(140)
    //is not finished
    println(result)
}

fun countVowelPermutation(n: Int): Long {
    if (n==1)
        return 5
    return findAVowelCount(n-1)+ findEVowelCount(n-1)+ findIVowelCount(n-1)+
            findOVowelCount(n-1)+ findUVowelCount(n-1)
}

fun findAVowelCount(count:Int):Long{
    if (count==1)
        return 1

     return findEVowelCount(count-1).let {
         if (it>1000000007)
             0L
         else it
     }
}

fun findEVowelCount(count:Int):Long{
    if (count==1)
        return 2
    return findAVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }+ findIVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }
}

fun findIVowelCount(count:Int):Long{
    if (count==1)
        return 4
    return findAVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }+ findEVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }+
            findOVowelCount(count-1).let {
                if (it>1000000007)
                    0L
                else it
            }+ findUVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }
}

fun findOVowelCount(count:Int):Long{
    if (count==1)
        return 2
    return findIVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }+findUVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }
}

fun findUVowelCount(count:Int):Long{
    if (count==1)
        return 1
    return findAVowelCount(count-1).let {
        if (it>1000000007)
            0L
        else it
    }
}
