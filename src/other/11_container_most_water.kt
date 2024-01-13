package other

import kotlin.math.max
import kotlin.math.min


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