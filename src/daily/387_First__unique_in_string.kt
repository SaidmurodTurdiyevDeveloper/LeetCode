package daily

fun firstUniqChar(s: String): Int {
    for(i in 0 until s.length){
        var j=i+1
        while(j<s.length){
            if (s[i]==s[j])
                j=s.length
            j++
        }
        if (j==s.length)
            return i
    }
    return -1
}