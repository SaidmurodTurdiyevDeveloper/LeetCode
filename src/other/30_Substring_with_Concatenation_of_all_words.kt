package other

import java.util.LinkedList

fun findSubstring(s: String, words: Array<String>): List<Int> {
    val lengthWord = words.first().length
    val length = lengthWord * words.size
    var i = 0
    val result = ArrayList<Int>()
    while (s.length >= i + length) {
        if (isExist(words, getWordsLIst(s,i,words.size,lengthWord))) {
            result.add(i)
        }
        i++
    }
    return result

}

private fun getWordsLIst(text:String,startIndex:Int,count:Int,length:Int):LinkedList<String>{
    val ls=LinkedList<String>()
    for (i in 0 until  count){
        ls.add(
            text.substring(startIndex+length*i,startIndex+(i+1)*length)
        )
    }
    return ls
}
private fun isExist(words: Array<String>, currentWord: LinkedList<String>): Boolean {
    words.forEach {
        currentWord.remove(it)
    }
    return currentWord.isEmpty()
}


