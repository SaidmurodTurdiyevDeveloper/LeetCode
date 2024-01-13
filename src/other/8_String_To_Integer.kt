package other


fun myAtoi(s: String): Int {
    var number=0
    val num=s.trim()
    var isNegative=false
    var isFindNumberType=false
    var isFindDigit=false

    for (i in num.indices){
        if (number==0&&num[i]=='-')
            isNegative=true

        if(num[i].isDigit()){
            isFindDigit=true
            if (number>Int.MAX_VALUE/10)
                return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
            if (
                num[i].digitToInt()>=7&&!isNegative&&Int.MAX_VALUE/10==number
            )
                return Int.MAX_VALUE
            if (
                num[i].digitToInt()>=8&&isNegative&&Int.MAX_VALUE/10==number
            )
                return Int.MIN_VALUE

            number=number*10 + num[i].digitToInt()
        } else if (!isFindNumberType&&(num[i]=='-'||num[i]=='+')&&!isFindDigit){
            isFindNumberType=true
        } else
            return  if (isNegative) (number*(-1)) else number
    }
    return if (isNegative) (number*(-1)) else number
}