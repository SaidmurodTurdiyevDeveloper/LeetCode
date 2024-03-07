package daily

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
    val dis = Array(n) {
        Int.MAX_VALUE
    }
    val adj: MutableMap<Int, MutableList<IntArray>> = HashMap()
    for (flight in flights) {

        adj.computeIfAbsent(
            flight[0]
        ) { ArrayList() }.add(intArrayOf(flight[1], flight[2]))
    }
    val queue: LinkedList<IntArray> = LinkedList<IntArray>()
    queue.add(intArrayOf(src, 0))
    dis[src] = 0
    var step = 0
    while (!queue.isEmpty() && step <= k) {
        var size = queue.size
        while (size-- > 0) {
            val node = queue.poll()
            adj.getOrDefault(node[0], ArrayList()).forEach {
                if (node[1] + it[1] < dis[it[0]]) {
                    dis[it[0]] = node[1] + it[1]
                    queue.add(intArrayOf(it[0], dis[it[0]]))
                }
            }
        }
        step++
    }

    return if (dis[dst]== Int.MAX_VALUE) -1 else dis[dst]
}