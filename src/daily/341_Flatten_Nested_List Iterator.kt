package daily


//class NestedIterator(nestedList: List<NestedInteger>) {
//    private var ls=ArrayList<Int>()
//    private var iterator=0
//    init{
//        ls.addAll(getAllList(nestedList))
//    }
//    fun next(): Int {
//        var d=if(hasNext()){
//            ls[iterator]
//        }
//        else  ls[ls.size-1]
//        iterator++
//        return d
//    }
//
//    fun hasNext(): Boolean {
//        return iterator<ls.size
//    }
//
//    private fun getAllList(nestedList: List<NestedInteger>):List<Int>{
//        val list=ArrayList<Int>()
//        nestedList.forEach{d->
//            if(d.isInteger()){
//                d.getInteger()?.let{
//                    list.add(it)
//                }
//            }
//            else{
//                d.getList()?.let{
//                    list.addAll(getAllList(it))
//                }
//
//            }
//        }
//        return list
//    }
//}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */