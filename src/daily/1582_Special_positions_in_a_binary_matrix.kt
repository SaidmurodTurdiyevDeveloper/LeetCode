package daily



fun numSpecial(mat: Array<IntArray>): Int {
    var result = 0
    mat.forEach {
        var count = 0
        var columnIndex = 0
        it.forEachIndexed { index, i ->
            if (i == 1) {
                count++
                columnIndex=index
            }
        }
        if (count == 1) {

            for (j in mat.indices) {
                if (mat[j][columnIndex] == 1) {
                    count++
                }
            }
            if (count == 2)
                result++

        }
    }
    return result
}