package other

import kotlin.math.abs

fun main() {
    val result = threeSumClosest(intArrayOf(-1000,-5,-5,-5,-5,-5,-5,-1,-1,-1), -14)
    println(result)
}


fun threeSumClosest(nums: IntArray, target: Int): Int {
    var i = 0
    var j: Int
    var k: Int
    val temp = nums.sorted()
    var closest = temp.first() + temp[1] + temp[2]
    var min = closest-target
    while (i < temp.size - 2) {
        j = i + 1
        k = temp.size - 1

        while (k > j) {
            if (abs(temp[i] + temp[j] + temp[k]-target) < abs(min)) {
                closest = temp[i] + temp[j] + temp[k]
                min=closest-target
            }

            if (temp[i] + temp[j] + temp[k] < target) {
                j++
            } else if(temp[i] + temp[j] + temp[k] > target) {
                k--
            } else{
                k=j
            }
        }
        i++
    }
    return closest
}