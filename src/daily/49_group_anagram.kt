package daily

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map=HashMap<String,List<String>>()
    var temp: String
    strs.forEach {
        temp=it.toList().sorted().toString()
        map[temp]= (map[temp]?: emptyList())+it
    }
    return map.values.toList()
}