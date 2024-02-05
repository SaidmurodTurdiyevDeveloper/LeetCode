package other

fun strStr(haystack: String, needle: String): Int {
    for(i in 0 until haystack.length){
        if(haystack[i]==needle[0]&&i+needle.length<=haystack.length){
            var j=1
            var correct=true
            while(j<needle.length){
                if(needle[j]!=haystack[i+j]){
                    correct=false
                    j=needle.length
                }
                j++
            }
            if(correct){
                return i
            }
        }
    }
    return -1
}