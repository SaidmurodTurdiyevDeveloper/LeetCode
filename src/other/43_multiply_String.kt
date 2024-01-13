package other

import kotlin.math.max

/**
 *
 *
43. Multiply Strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"


Constraints:

1 <= num1.length, num2.length <= 200

num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 *
 */

fun main() {
    val result = multiply("123224", "4562")
    println(result)
}


fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0")
        return "0"
    val lines = ArrayList<String>(num1.length)
    for (i in num1.length - 1 downTo 0) {
        lines.add(multiplyChar(num1[i].digitToInt(), num2,num1.length-1-i))
    }
    return addLines(lines)
}

fun multiplyChar(char1: Int, num2: String, countZero: Int): String {

    var additional = 0

    var number = ""
    for (i in num2.length - 1 downTo 0) {
        val t = char1 * num2[i].digitToInt() + additional % 10
        number = (t % 10).toString() + number
        additional = t / 10 + additional / 10
    }
    if (additional > 0) {
        number = additional.toString() + number
    }
    for (i in 0 until countZero) {
        number += "0"
    }
    return number
}

fun addLines(ls:ArrayList<String>):String{
    var number = "0"
    ls.forEach {
        number= addString(it,number)
    }
    return number
}
fun addString(first:String,second:String):String{
    var additional = 0
    val repeatCount= max(first.length,second.length)
    var number = ""
    for (i in 0 until repeatCount){
        val f=if (first.length-i>0)first[first.length-1-i].digitToInt() else 0
        val s=if (second.length-i>0)second[second.length-1-i].digitToInt() else 0
        val t=s+f+additional%10
        number=(t%10).toString()+number
        additional=t/10+additional/10
    }
    if (additional > 0) {
        number = additional.toString() + number
    }
    return number
}