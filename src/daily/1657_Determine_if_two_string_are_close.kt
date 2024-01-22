package daily


fun closeStrings(word1: String, word2: String): Boolean {
    if (word2.length != word1.length)
        return false
    val firstMap=HashMap<Char,Int>()
    val secondMap=HashMap<Char,Int>()
    for (i in 0 until word1.length){
        firstMap[word1[i]]=1+(firstMap[word1[i]]?:0)
        secondMap[word2[i]]=1+(secondMap[word2[i]]?:0)
    }
    return firstMap.values.sorted() == secondMap.values.sorted()&&firstMap.keys.sorted()==secondMap.keys.sorted()
}