package daily


fun backspaceCompare(s: String, t: String): Boolean {

    return getText(s) == getText(t)

}
fun getText(str:String):String{
    var text=""
    var count=0
    for (i in str.length-1 downTo 0){
        if (str[i]=='#'){
            count++
        } else{
            if (count>0){
                count--
            }else{
                text+=str[i]
            }
        }
    }
    return text
}