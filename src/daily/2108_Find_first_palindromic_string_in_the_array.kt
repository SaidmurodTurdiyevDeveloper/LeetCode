package daily

fun firstPalindrome(words: Array<String>): String {
    for(text in words){
        if(isPalindrome(text)){
            return text
        }
    }
    return ""
}
fun isPalindrome(text:String):Boolean{
    val size=text.length/2
    var j=0
    while(j<size){
        if(text[j]!=text[text.length-1-j]){
            return false
        }
        j++
    }
    return true
}