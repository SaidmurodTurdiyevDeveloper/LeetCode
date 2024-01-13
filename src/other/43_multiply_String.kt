package other

import kotlin.math.max


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