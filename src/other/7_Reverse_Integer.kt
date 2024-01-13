package other



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