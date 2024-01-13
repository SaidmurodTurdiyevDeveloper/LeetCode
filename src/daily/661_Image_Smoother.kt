package daily

import kotlin.math.floor

fun main() {
    var result= imageSmoother(
        arrayOf(
            intArrayOf(100,200,100),
            intArrayOf(200,50,200),
            intArrayOf(100,200,100)
        )
    )
    println(result[0].toList())
    println(result[1].toList())
    println(result[2].toList())
}

fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val result = Array(img.size) {
        IntArray(img[0].size)
    }
    for (i in img.indices) {
        for (j in img[i].indices) {
            result[i][j] = getAverage(
                startI = if (i > 0) (i - 1) else 0,
                endI = if (i < img.size - 1) (i + 1) else (img.size - 1),
                startJ = if (j > 0) (j - 1) else 0,
                endJ = if (j < img[i].size - 1) (j + 1) else (img[i].size - 1),
                img = img
            )
        }
    }
    return result
}

fun getAverage(startI: Int, endI: Int, startJ: Int, endJ: Int, img: Array<IntArray>): Int {
    var count = 0
    var sum = 0.0
    for (i in startI..endI) {
        for (j in startJ..endJ) {
            sum += img[i][j]
            count++
        }
    }
    return floor(sum / count).toInt()
}