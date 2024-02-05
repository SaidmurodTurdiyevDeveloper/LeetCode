package other

fun removeDuplicates(nums: IntArray): Int {
    var count=1
    var j=1
    for (i in 1 until  nums.size){
        if (nums[i]>nums[i-1]){
            count++
            nums[j]=nums[i]
            j++
        }
    }
    return count
}