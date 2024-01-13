package daily

fun main(){
    val right=TreeNode(3)
    val level=TreeNode(2)
    val level5=TreeNode(5)
    level.left=level5
    val d=TreeNode(1)
    d.left=level
    d.right=right
    val result=findItem(
        d,ArrayList()
    )
    println(result)
}

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val ls=findItem(root1,ArrayList<Int>())
    val ls1=findItem(root2,ArrayList<Int>())
    return ls == ls1
}

fun findItem(root:TreeNode?,ls:ArrayList<Int>):List<Int>{
    if(root!=null&& root.left ==null&& root.right ==null)
        ls.add(root.`val`)
    if(root?.left!=null){
        findItem(root.left,ls)
    }
    if(root?.right!=null){
        findItem(root.right,ls)
    }
    return ls
}