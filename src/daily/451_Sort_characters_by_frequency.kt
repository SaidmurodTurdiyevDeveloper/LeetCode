package daily

data class CharacterData(var text: String, var isLasLarge: Boolean)

fun frequencySort(s: String): String {
    val map = HashMap<Char, String>()
    s.forEach {
        map[it] = map[it]?.let { t ->
            t + it
        } ?: it.toString()
    }
    val ls = map.values.sortedBy {
        it.length
    }
    var text = ""
    for (sText in ls) {
        text = sText + text
    }
    return text
}