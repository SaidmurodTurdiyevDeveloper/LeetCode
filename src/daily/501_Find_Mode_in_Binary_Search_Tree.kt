package daily

/**
 * 501. Find Mode in Binary Search Tree
 *
 * Easy
 *
 * Given the root of a binary search tree (BST) with duplicates, return all the mode(s)
 * (i.e., the most frequently occurred element) in it.
 *
 * If the tree has more than one mode, return them in any order.
 *
 * Assume a BST is defined as follows:
 * -The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * -The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * -Both the left and right subtrees must also be binary search trees.
 *
 * Input: root = [1,null,2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: root = [0]
 * Output: [0]
 *
 *
 *  Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 *
 */

fun main(){
    val right=TreeNode(3)
    val level=TreeNode(2)
    val d=TreeNode(1)
    d.left=level
    d.right=right
    val result=findMode(
        d
    )
    for (i in result){
    println(i)
    }
}
fun findMode(root: TreeNode?): IntArray {
    val map=HashMap<Int,Int>()
    if (root==null)
        return IntArray(0)
    var rootLs=ArrayList<TreeNode>()
    map[root.`val`]=0
    var maxValue=0
    rootLs.add(root)
    while (rootLs.isNotEmpty()){
        val newRootLs=ArrayList<TreeNode>()
        for (i in 0 until rootLs.size){
            if (rootLs[i].left!=null){
                map[rootLs[i].left!!.`val`]= (map[rootLs[i].left!!.`val`] ?: -1) + 1
                if (maxValue<(map[rootLs[i].left!!.`val`] ?: -1)){
                    maxValue=(map[rootLs[i].left!!.`val`] ?: -1)
                }
                newRootLs.add(rootLs[i].left!!)
            }
            if (rootLs[i].right!=null){
                map[rootLs[i].right!!.`val`]= (map[rootLs[i].right!!.`val`] ?: -1) + 1
                if (maxValue<(map[rootLs[i].right!!.`val`] ?: -1)){
                    maxValue=(map[rootLs[i].right!!.`val`] ?: -1)
                }
                newRootLs.add(rootLs[i].right!!)
            }
        }
        rootLs=newRootLs
    }
    return findMost(map,maxValue)
}
fun findMost(map: Map<Int,Int>,max:Int):IntArray{
    val maxValue=ArrayList<Int>()
    map.forEach {
        if (it.value==max){
            maxValue.add(it.key)
        }
    }
    return maxValue.toIntArray()
}