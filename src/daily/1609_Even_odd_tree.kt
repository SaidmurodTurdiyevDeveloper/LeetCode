package daily

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun isEvenOddTree(root: TreeNode?): Boolean {
    if ((root?.`val` ?: 0) % 2 == 0)
        return false
    var ls = listOf(root!!)
    var level = 0
    while (ls.isNotEmpty()) {
        val newLs = ArrayList<TreeNode>()
        if (level % 2 == 0) {
            var before = 0
            ls.forEach {
                if (it.`val` <= before||it.`val`%2==0)
                    return false
                else {
                    it.left?.let { left ->
                        newLs.add(left)
                    }
                    it.right?.let { right ->
                        newLs.add(right)
                    }
                    before=it.`val`
                }
            }
        } else {
            var before = 1000001
            ls.forEach {
                if (it.`val` >= before||it.`val`%2==1)
                    return false
                else {
                    it.left?.let { left ->
                        newLs.add(left)
                    }
                    it.right?.let { right ->
                        newLs.add(right)
                    }
                    before=it.`val`
                }
            }
        }
        ls = newLs
        println(ls)
        level++
    }
    return true
}