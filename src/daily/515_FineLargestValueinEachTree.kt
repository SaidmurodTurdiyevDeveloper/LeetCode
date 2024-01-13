package daily

/**
 * 515. Find Largest Value in Each Tree Row
 *
 * Medium
 *
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,3,2,5,3,null,9]
 * Output: [1,3,9]
 * Example 2:
 *
 * Input: root = [1,2,3]
 * Output: [1,3]
 *
 *
 * /**
 *  * Example:
 *  * var ti = TreeNode(5)
 *  * var v = ti.`val`
 *  * Definition for a binary tree node.
 *  * class TreeNode(var `val`: Int) {
 *  *     var left: TreeNode? = null
 *  *     var right: TreeNode? = null
 *  * }
 *  */
 */

fun main(){
    var right=TreeNode(3)
    var level=TreeNode(2)
    var d=TreeNode(1)
    d.left=level
    d.right=right
    val result=largestValues(
        d
    )
    println(result)
}

fun largestValues(root: TreeNode?): List<Int> {
    val ls=ArrayList<Int>()
    if (root==null)
        return ls
    var rootLs=ArrayList<TreeNode>()
    ls.add(root.`val`)
    rootLs.add(root)
    while (rootLs.isNotEmpty()){
        val newRootLs=ArrayList<TreeNode>()
        var max:Int?=null
        for (i in 0 until rootLs.size){
            if (rootLs[i].left!=null){
                if (max==null||max<rootLs[i].left!!.`val`){
                    max=rootLs[i].left!!.`val`
                }
                newRootLs.add(rootLs[i].left!!)
            }
            if (rootLs[i].right!=null){
                if (max==null||max<rootLs[i].right!!.`val`){
                    max=rootLs[i].right!!.`val`
                }
                newRootLs.add(rootLs[i].right!!)
            }
        }
        rootLs=newRootLs
        if (max!=null)
            ls.add(max)
    }
    return ls
}



 class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
}