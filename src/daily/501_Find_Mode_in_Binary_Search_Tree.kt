package daily


//fun findMode(root: TreeNode?): IntArray {
//    val map=HashMap<Int,Int>()
//    if (root==null)
//        return IntArray(0)
//    var rootLs=ArrayList<TreeNode>()
//    map[root.`val`]=0
//    var maxValue=0
//    rootLs.add(root)
//    while (rootLs.isNotEmpty()){
//        val newRootLs=ArrayList<TreeNode>()
//        for (i in 0 until rootLs.size){
//            if (rootLs[i].left!=null){
//                map[rootLs[i].left!!.`val`]= (map[rootLs[i].left!!.`val`] ?: -1) + 1
//                if (maxValue<(map[rootLs[i].left!!.`val`] ?: -1)){
//                    maxValue=(map[rootLs[i].left!!.`val`] ?: -1)
//                }
//                newRootLs.add(rootLs[i].left!!)
//            }
//            if (rootLs[i].right!=null){
//                map[rootLs[i].right!!.`val`]= (map[rootLs[i].right!!.`val`] ?: -1) + 1
//                if (maxValue<(map[rootLs[i].right!!.`val`] ?: -1)){
//                    maxValue=(map[rootLs[i].right!!.`val`] ?: -1)
//                }
//                newRootLs.add(rootLs[i].right!!)
//            }
//        }
//        rootLs=newRootLs
//    }
//    return findMost(map,maxValue)
//}
//fun findMost(map: Map<Int,Int>,max:Int):IntArray{
//    val maxValue=ArrayList<Int>()
//    map.forEach {
//        if (it.value==max){
//            maxValue.add(it.key)
//        }
//    }
//    return maxValue.toIntArray()
//}