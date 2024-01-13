package daily

fun main(){
    val result= halvesAreAlike("textbook")
    println(result)
}


fun halvesAreAlike(s: String): Boolean {
    var count=0
    var i=0
    while(i<s.length/2){
        when(s[i]){
            'a','u','i','o','e','A','U','I','O','E'->count++
        }
        when(s[s.length-1-i]){
            'a','u','i','o','e','A','U','I','O','E'->count--
        }
        i++
    }
    return count==0
}