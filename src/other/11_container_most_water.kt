package other

import kotlin.math.max
import kotlin.math.min


fun main() {
//    val result = maxArea(
//        intArrayOf(
//            2, 3, 4, 5, 18, 17, 6
//        )
//    )
    val result = maxArea(
        intArrayOf(
            1,8,6,2,5,4,8,3,7
        )
    )
    println(result)
}

fun maxArea(height: IntArray): Int {
    var max = 0
    var temp: Int
    var i = 0
    var j = height.lastIndex
    while (i<j) {
        temp = min(height[i], height[j]) * (j - i)
        if (temp>max){
            max=temp

        }
        if (height[i]<height[j])
            i++
        else j--

    }
    return max
}