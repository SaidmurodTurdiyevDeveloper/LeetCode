package daily

//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
//
//fun pseudoPalindromicPaths(root: TreeNode?): Int {
//    val lines = ArrayList<Map<Int,Int>>()
//    getLines(emptyMap(), lines, root)
//    var count = 0
//    println(lines)
//    lines.forEach {
//        if (isPalindromic(it))
//            count++
//    }
//    return count
//}
//
//fun getLines(ls: Map<Int,Int>, lsRoot: ArrayList<Map<Int,Int>>, root: TreeNode?) {
//    if (root == null) {
//        return
//    }
//    val myList = HashMap(ls)
//
//    myList[root.`val`] = (myList[root.`val`] ?:0)+1
//    if (root.left == null && root.right == null) {
//        lsRoot.add(myList)
//    } else {
//        if (root.left != null) {
//            getLines(myList, lsRoot, root.left)
//        }
//        if (root.right != null) {
//            getLines(myList, lsRoot, root.right)
//        }
//    }
//}
//
//fun isPalindromic(map: Map<Int,Int>): Boolean {
//    var count = 0
//    map.forEach { (_, u) ->
//        if (u % 2 == 1) {
//            count++
//            if (count>=2)
//                return false
//        }
//    }
//    return true
//}