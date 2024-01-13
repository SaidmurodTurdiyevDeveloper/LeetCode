package daily

import kotlin.math.min


fun main() {
val result= minOperations("1111")
    println(result)
}


fun minOperations(s: String): Int {
    var zero = 0
    var one=0
    for (i in s.indices){
        if (i%2==0){
            if (s[i]!='0')
                zero++
            else
                one++
        }else{
            if (s[i]!='0')
                one++
            else
                zero++
        }
    }
    return min(zero,one)
}