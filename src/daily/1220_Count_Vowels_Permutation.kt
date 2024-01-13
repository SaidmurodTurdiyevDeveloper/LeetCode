package daily


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
