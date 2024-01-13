package daily


//first
//fun isAnagram(s: String, t: String): Boolean {
//    if(s.length!=t.length)
//        return false
//
//    return s.toCharArray().also { it.sort() }.contentEquals(t.toCharArray().also { it.sort() })
//}
//second
fun isAnagram(s: String, t: String): Boolean {
    if(s.length!=t.length)
        return false
    val result=Array(27){
        0
    }
    for (i in s.indices){
        result[s[i]-'a']+=1
        result[t[i]-'a']-=1
    }
    for (i in result){
        if (i!=0)
            return false
    }
    return true
}