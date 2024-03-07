package daily

fun countSubstrings(s: String): Int {
    var count = 0
    for (i in 0 until s.length) {
        count++
        for( j in i+1 until s.length){
            if(isPalindromic(s,i,j))
                count++
        }
    }
    return count
}

fun isPalindromic(s: String,start:Int,end:Int):Boolean{
    var st=start
    var e=end
    while (st<e){
        if (s[st]!=s[e])
            return false
        st++
        e--
    }
    return true
}
