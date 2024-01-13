package other

import java.util.*



//time limit exception

//fun threeSum(nums: IntArray): List<List<Int>> {
//    val temp = nums.sorted()
//    val ls = ArrayList<List<Int>>()
//    var k: Int
//    for (i in 0..<temp.size - 2) {
//        if (temp[i] > 0){
//            println(ls.size)
//            return ls.toList()
//        }
//        for (j in i + 1..<temp.size - 1) {
//                k = j + 1
//                while (temp.size > k) {
//                    if (temp[i] + temp[j] + temp[k] == 0) {
//                        if (ls.isEmpty()){
//                            ls.add(listOf(temp[i], temp[j], temp[k]))
//                            k=temp.size
//                        }
//                        else if (ls.last()[0]!=temp[i]||ls.last()[1]!=temp[j]||ls.last()[2]!=temp[k]){
//                            ls.add(listOf(temp[i], temp[j], temp[k]))
//                            k=temp.size
//                        }
//                    }
//                    k++
//                }
//
//
//        }
//    }
//    println(ls.size)
//    return ls
//}


fun threeSum(nums: IntArray): List<List<Int>> {
    return solution(nums)
}

private fun solution(nums: IntArray): List<List<Int>> {
    Arrays.sort(nums)
    val result: MutableList<List<Int>> = ArrayList()

    val len = nums.size
    if (len < 3) return result

    for (i in 0 until len) {
        if (nums[i] > 0) {
            return result
        }
        if (!(i > 0 && nums[i] == nums[i - 1])){
            var l = i + 1
            var r = len - 1
            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                if (sum > 0) {
                    r--
                } else if (sum < 0) {
                    l++
                } else {
                    result.add(listOf(nums[i], nums[l], nums[r]))
                    val curr_l = nums[l]
                    val curr_r = nums[r]
                    // required for de-duping
                    while (l < r && nums[l] == curr_l) {
                        l++
                    }
                    while (l < r && nums[r] == curr_r) {
                        r--
                    }
                }
            }
        }

    }
    return result
}