package daily

fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
    val map = HashMap<Int, Int>()
    arr.forEach {
        map[it] = (map[it] ?: 0) + 1
    }
    var t = k
    val size = map.values.size
    var removeCount = 0
    map.values.sorted().forEach {
        if (t >= it) {
            t -= it
            removeCount++
        } else {
            return size - removeCount
        }
    }
    return 0
}