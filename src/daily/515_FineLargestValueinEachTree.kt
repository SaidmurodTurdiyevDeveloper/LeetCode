package daily


//fun largestValues(root: TreeNode?): List<Int> {
//    val ls=ArrayList<Int>()
//    if (root==null)
//        return ls
//    var rootLs=ArrayList<TreeNode>()
//    ls.add(root.value)
//    rootLs.add(root)
//    while (rootLs.isNotEmpty()){
//        val newRootLs=ArrayList<TreeNode>()
//        var max:Int?=null
//        for (i in 0 until rootLs.size){
//            if (rootLs[i].left!=null){
//                if (max==null||max<rootLs[i].left!!.value){
//                    max=rootLs[i].left!!.value
//                }
//                newRootLs.add(rootLs[i].left!!)
//            }
//            if (rootLs[i].right!=null){
//                if (max==null||max<rootLs[i].right!!.value){
//                    max=rootLs[i].right!!.value
//                }
//                newRootLs.add(rootLs[i].right!!)
//            }
//        }
//        rootLs=newRootLs
//        if (max!=null)
//            ls.add(max)
//    }
//    return ls
//}
//
//
//
// class TreeNode(var value: Int) {
//        var left: TreeNode? = null
//        var right: TreeNode? = null
//}