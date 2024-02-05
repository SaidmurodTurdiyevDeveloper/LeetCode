package other

/**
 * first sollution
 */
//fun removeElement(nums: IntArray, `val`: Int): Int {
//    var count=0
//    var j=0
//    nums.forEach {
//        if (`val`!=it){
//            nums[j]=it
//            j++
//        }else
//            count++
//    }
//    return  nums.size-count
//}

/**
 * second sollution
 */

fun removeElement(nums: IntArray, `val`: Int): Int {
    var j=0
    nums.forEach {
        if (`val`!=it){
            nums[j]=it
            j++
        }
    }
    return j
}