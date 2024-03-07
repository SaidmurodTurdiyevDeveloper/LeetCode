package daily

/**
 * first sort
 */
fun rearrangeArray(nums: IntArray): IntArray {
    val arr = IntArray(nums.size)
    var i = 0
    var j = 0
    var index = 0
    var condFirst: Boolean
    var condSecond: Boolean
    while (index < nums.size) {
        condFirst = true
        condSecond = true
        while (condFirst&&i<nums.size) {
            if (nums[i] > 0){
                arr[index] = nums[i]
                condFirst=false
                index++
            }
            i++
        }
        while (condSecond&&j<nums.size) {
            if (nums[j] < 0){
                arr[index] = nums[j]
                condSecond=false
                index++
            }
            j++
        }
    }
    return arr
}