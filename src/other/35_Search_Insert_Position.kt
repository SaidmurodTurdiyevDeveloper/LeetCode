package other

fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums[0] >= target)
        return 0
    if (nums[nums.size - 1] < target)
        return nums.size
    var start = 0
    var end = nums.size - 1
    var mid: Int
    while (start < end) {
        mid = (end + start) / 2
        if (nums[mid] == target)
            return mid
        if (target in nums[mid]until nums[mid + 1])
            return mid + 1
        if (nums[mid] < target) {
            start = mid
        } else {
            end = mid
        }
    }
    return nums.size + 1
}