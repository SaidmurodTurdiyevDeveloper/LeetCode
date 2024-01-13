package other

import daily.backspaceCompare


fun longestPalindrome(s: String): String {
    var longString=""
    var endIndex=0
    var startIndex=0
    for (i in s.indices){
        val index=findPalindromeLastIndex(i,s)
        if (endIndex-startIndex<=index-i){
            startIndex=i
            endIndex=index
        }
    }
    for ( i in startIndex .. endIndex){
        longString+=s[i]
    }
    return longString
}

fun findPalindromeLastIndex(startIndex:Int,str:String):Int{
    var endIndex=startIndex
    var count=1
    while (true){
        val t= findNextIndex(str[startIndex],str,endIndex+count)
        if (t==-1){
            return endIndex
        }
        if (isPalindrome(str,startIndex,t)){
            endIndex=t
        }
        else count++
    }
}
fun isPalindrome(str: String,startIndex: Int,endIndex:Int):Boolean{
    var i=startIndex
    var j=endIndex
    while (i<=j){
        if (str[i]!=str[j])
            return false
        i++
        j--
    }
    return true
}

fun findNextIndex(c:Char,str: String,startIndex: Int):Int{
    for ( i in startIndex until str.length){
        if (str[i]==c)
            return i
    }
    return -1
}