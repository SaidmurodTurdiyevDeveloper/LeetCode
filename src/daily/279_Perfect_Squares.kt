package daily

import kotlin.math.pow
import kotlin.math.sqrt

fun numSquares(n: Int): Int {
   if (isSquare(n))
       return 1
    if (isSquareTwo(n.toDouble()))
        return 2
    if (isSquareThree(n.toDouble()))
        return 3
    return 4
}

fun isSquare(n: Int):Boolean{
    val temp= sqrt(n.toDouble()).toInt()
    return (n- temp.toDouble().pow(2.0).toInt())==0
}

fun isSquareTwo(n: Double):Boolean{
    val end= sqrt(n).toInt()
    for (i in 1 .. end){
        for (j in end downTo i){
            if ((i.toDouble().pow(2.0)+(j).toDouble().pow(2.0))==n)
                return true
        }
    }
    return false
}

fun isSquareThree(n: Double):Boolean{
    var i=0
    var j:Int
    var iExist=true
    while (iExist){
        j=((n/(4.0.pow(i))-7)/8).toInt()
        if ((4.0.pow(i)*(8*j+7))==n)
            return false
        if ((4.0.pow(i)*7.0)>=n)
            iExist=false
        i++
    }
    return true
}
