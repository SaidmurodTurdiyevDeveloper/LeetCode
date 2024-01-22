package daily


data class User(var index: Int, val winCount: Int, val loosCount: Int)

fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val map = HashMap<Int, User>()
    for (match in matches) {
        val winner = map[match.first()]
        val loser = map[match[1]]
        map[match.first()] =
            if (winner != null) winner.copy(winCount = winner.winCount + 1) else User(match.first(), 1, 0)
        map[match[1]] = if (loser != null) loser.copy(loosCount = loser.loosCount + 1) else User(match[1], 0, 1)
    }
    val winners = map.values.filter {
        it.loosCount == 0
    }.map {
        it.index
    }.sorted()
    val looseOne = map.values.filter {
        it.loosCount == 1
    }.map {
        it.index
    }.sorted()

    return listOf(winners,looseOne)
}