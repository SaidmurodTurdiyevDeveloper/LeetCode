package daily

fun main() {
    val result = minSteps(s = "leetcode", t = "practice")
    println(result)
}


fun minSteps(s: String, t: String): Int {
    val listSymbols = HashMap<Char, Int>()
    s.forEach {
        listSymbols[it] = 1 + (listSymbols[it] ?: 0)
    }
    t.forEach {
        listSymbols[it] = if ((listSymbols[it] ?: 0) > 0) {
            (listSymbols[it] ?: 0) - 1
        } else 0
    }
    var count = 0
    listSymbols.forEach { (_, u) ->
        count += u
    }
    return count
}