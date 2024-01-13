package daily

/**
 * 844. Backspace String Compare
 *
 * Easy
 *
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 * Example 2:
 *
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 * Example 3:
 *
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 */
fun main(){
    val result= backspaceCompare(
       "a#c",
        "b"
    )

    println("result $result")
}

fun backspaceCompare(s: String, t: String): Boolean {

    return getText(s) == getText(t)

}
fun getText(str:String):String{
    var text=""
    var count=0
    for (i in str.length-1 downTo 0){
        if (str[i]=='#'){
            count++
        } else{
            if (count>0){
                count--
            }else{
                text+=str[i]
            }
        }
    }
    return text
}