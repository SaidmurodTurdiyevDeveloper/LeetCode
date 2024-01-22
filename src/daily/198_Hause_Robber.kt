package daily

import kotlin.math.max


fun rob(nums: IntArray): Int {
    if (nums.size == 1)
        return nums.first()
    if (nums.size == 2)
        return max(nums[0], nums[1])

    if (nums.size == 3) {
        return max(nums[0] + nums[2], nums[1])
    }
    var i = if (nums[2] >= nums[1]) {

        0
    } else {
        if (nums[0] + nums[2] > nums[1] + nums[3])
            0
        else
            1
    }
    var sum = nums[i]
    while (i + 2 < nums.size) {
        if (i + 3 == nums.size) {
            sum += nums[i + 2]
            println(nums[i + 2])
            i += 2
        } else if (i + 4 < nums.size) {
            if (nums[i + 2] + nums[i + 4] > nums[i + 3]) {
                sum += nums[i + 2]
                println(nums[i + 2])
                i += 2
            } else {
                sum += nums[i + 3]
                println(nums[i + 3])
                i += 3
            }
        } else {
            if (nums[i + 2] > nums[i + 3]) {
                sum += nums[i + 2]
                println(nums[i + 2])
                i += 2
            } else {
                sum += nums[i + 3]
                println(nums[i + 3])
                i += 3
            }
        }
    }
    return sum
}