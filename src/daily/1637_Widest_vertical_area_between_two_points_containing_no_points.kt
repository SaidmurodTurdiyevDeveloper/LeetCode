package daily

import kotlin.math.max
import kotlin.math.min


//first sollution

fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
    val temp = points
    temp.sortBy {
        it[0]
    }
    var max = 0
    for (i in 1 until temp.size) {
        if (max < temp[i][0] - temp[i - 1][0])
            max = temp[i][0]-temp[i-1][0]
    }
    return max
}

//fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
//    val temp = points
//    temp.sortBy {
//        it[0]
//    }
//    var i=0
//    var j=temp.size-1
//    while (i<j){
//        if (points[])
//    }
//    return 1
//    for (i in 1 until points.size-1) {
//        if (points[i]>)
//    }
//    return max
//}