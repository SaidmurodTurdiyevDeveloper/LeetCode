package daily

import java.util.SortedSet
import java.util.TreeSet
import kotlin.math.abs

fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
    val lengthSet = ArrayList<Int>()
    var maxLengthIndex = 0
    var countB = bricks
    var dif: Int
    var countL = ladders
    for (i in 1 until heights.size) {
        dif = heights[i] - heights[i - 1]
        if (dif > 0) {
            if (dif > bricks) {
                if (countL > 0)
                    countL--
                else return i - 1
            } else if (dif <= countB) {
                countB -= dif
                lengthSet.add(dif)
                if (lengthSet[maxLengthIndex] < dif)
                    maxLengthIndex = lengthSet.size - 1
            } else {
                if (countL == 0)
                    return i - 1

                if (lengthSet[maxLengthIndex] <= dif) {
                    countL--
                } else {
                    countB = countB + lengthSet[maxLengthIndex] - dif
                    lengthSet[maxLengthIndex] = dif
                    maxLengthIndex = 0
                    for (j in 0 until lengthSet.size) {
                        if (lengthSet[maxLengthIndex] < lengthSet[j])
                            maxLengthIndex = j
                    }
                    countL--
                }
            }
        }
    }
    return heights.size - 1
}





