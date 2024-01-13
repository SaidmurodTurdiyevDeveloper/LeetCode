package daily


fun main() {
    val right = TreeNode(3)
    val level = TreeNode(2)
    val d = TreeNode(1)
    val g = TreeNode(4)
    level.left = g
    d.left = level
    d.right = right
    val result = tree2str(d)
    println(result)
    println(result=="1(2(4))(3)")
}


fun tree2str(root: TreeNode?): String {
    if (root==null)
        return ""
    if (root.left==null&&root.right==null)
        return root.`val`.toString()
    if (root.left!=null&&root.right!=null)
        return root.`val`.toString()+ "("+tree2str(root.left)+")"+"("+tree2str(root.right)+")"
    if (root.left!=null)
        return root.`val`.toString()+"("+tree2str(root.left)+")"
    return root.`val`.toString()+"()("+tree2str(root.right)+")"
}


