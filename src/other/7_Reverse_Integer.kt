package other


/**
 * 7. Reverse Integer
 *
 * Medium
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 */

fun main(){
    val result= reverse(15342469)
    println(result)
}


fun reverse(x: Int): Int {
    val isNegative=x<0
    var number=0L
    var example=if (isNegative)(x*-1) else x
    var additionalTens=1
    while (example>0){
        if (example%10==0){
            additionalTens*=10
        }
        else{
            number= number*10*additionalTens+example%10
            additionalTens=1
        }
        example/=10
    }
    if (isNegative)
        number*=-1
    if (2147483647<number||-2147483648>number)
        return 0
    return number.toInt()
}