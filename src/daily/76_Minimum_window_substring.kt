package daily


fun minWindow(s: String, t: String): String {
    if (t.length > s.length)
        return ""
    if (s.isEmpty())
        return ""
    var result = ""
    val tMap=t.groupBy {
        it
    }
    val map=HashMap<Char,Int>()
    var i = 0
    while (i <= (s.length - t.length)) {
        if (tMap[s[i]]!=null) {
            var j = i
            var temp = t
            var example = ""
            while (j < s.length) {
                example += s[j]
                if (tMap[s[i]]!=null) {
                    temp = temp.replaceFirst(s[j], ' ')
                    if (temp.isBlank()) {
                        if (result.length > example.length || result.isBlank()) {
                            result = example
                        }
                        i = j
                        j = s.length
                    }
                }
                j++
            }
        }
        i++
    }
    return result
}