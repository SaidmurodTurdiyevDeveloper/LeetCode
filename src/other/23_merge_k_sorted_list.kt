package other

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    var index = -1
    var isFind = true
    var root: ListNode? = null
    var current: ListNode? = null
    while (isFind) {
        var min = lists.firstOrNull()?.`val`
        index = -1
        for (i in 0 until lists.size) {
            if (lists[i] != null) {
                if (min == null) {
                    min = lists[i]?.`val`
                    index = i
                } else {
                    if (lists[i]!!.`val` <= min) {
                        min = lists[i]!!.`val`
                        index = i
                    }
                }
            }
        }
        if (min != null) {
            if (root == null) {
                root = ListNode(min)
                current = root
            } else {
                val t = ListNode(min)
                current?.next = t
                current = t
            }
            lists[index] = lists[index]?.next
        } else
            isFind = false
    }
    return root
}