package other

/**
 *6. Zigzag Conversion
 *
 * Medium
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 */

fun main(){
val result=convert("PAYPALISHIRING",5)
    println("PHASIYIRPLIGAN")
    println()
    println(result)
    println(result == "PHASIYIRPLIGAN")
}

fun convert(s: String, numRows: Int): String {
    if (numRows==1)
        return s
    var l=""
    var before=0
    var after=0
    var index=0
    for (i in 0 until numRows){
        index=i
        before=i*2
        after=(numRows-1-i)*2
        if (index<s.length)
        l+=s[index]
        while (index<s.length){
            if (after!=0){
                index+=after
                if ((index<s.length)){
                    l+=s[index]
                }

            }
            if (before!=0){
                index+=before
                if ((index<s.length)){
                    l+=s[index]
                }
            }
        }
    }
    return l
}
