package other
fun main(){
    val result= findMedianSortedArrays(
        arrayOf(1).toIntArray(),
        arrayOf(2,3).toIntArray()
    )

    println("result $result")
}

/**
 * 4. Median of Two Sorted Arrays
 *
 * Hard
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums1.isEmpty()){
        return getMiddle(nums2)
    }
    if (nums2.isEmpty()){
        return getMiddle(nums1)
    }
    var i=0
    var j=0
    val size=nums1.size+nums2.size
    var hasCoupleMiddle=size%2==0
    println("hasCoupleMiddle $hasCoupleMiddle")

    val midIndex=if (hasCoupleMiddle) (size/2-1) else size/2
    println(midIndex)
    var hasAllMiddle=size%2==0
    var firstNumber=0
    var isFinishI=false
    var isFinishJ=false
    while((i+j)<size){

        if ((nums1[if (!isFinishI)i else i-1]>nums2[if (!isFinishJ)j else i-1]||isFinishI)&&!isFinishJ) {
            // we must get j
            if ((i+j)>=midIndex){
                println("find J")
                println("hasCoupleMiddle $hasCoupleMiddle")
                println("hasAllMiddle $hasAllMiddle")
                println("J $j")

                if (!hasCoupleMiddle){
                    return if (hasAllMiddle)
                        (nums2[j]+firstNumber)/2.0
                    else
                        nums2[j].toDouble()
                }
                else{
                    hasAllMiddle=true
                    hasCoupleMiddle=false
                    firstNumber=nums2[j]
                }
            }
            isFinishJ=(nums2.size-1)==j
            j++

        } else {
            // we must get i
            if ((i+j)>=midIndex){
                println("find I")
                if (!hasCoupleMiddle){
                    return if (hasAllMiddle)
                        (nums1[i]+firstNumber)/2.0
                    else
                        nums1[i].toDouble()
                }

                else{
                    hasCoupleMiddle=false
                    hasAllMiddle=true
                    firstNumber=nums1[i]
                }
            }
            isFinishI=(nums1.size-1)==i
            i++
        }
    }
    return 0.0
}

fun getMiddle(nums: IntArray): Double{
    val hasCoupleMiddle=nums.size%2==0
    val middleIndex=nums.size/2
    return if (hasCoupleMiddle)
        (nums[middleIndex-1]+nums[middleIndex])/2.0
    else nums[middleIndex].toDouble()
}