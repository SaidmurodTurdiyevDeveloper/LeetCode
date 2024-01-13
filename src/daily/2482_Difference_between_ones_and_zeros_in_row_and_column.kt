package daily



fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
    if (grid.isEmpty())
        return emptyArray()
    val initArray = Array(grid.size) { IntArray(grid[0].size) }
    val rowLs = Array<Int>(grid.size){0}
    var sum = 0
    grid.forEachIndexed { index,rows ->
        sum = 0
        rows.forEach {
            sum = if (it == 0) {
                sum - 1
            } else {
                sum + 1
            }
        }
        rowLs[index]=sum
    }

    for (i in 0 until grid[0].size) {
        sum = 0
        grid.forEach {
            sum = if (it[i] == 0) {
                sum - 1
            } else {
                sum + 1
            }
        }
        for (j in grid.indices) {
            initArray[j][i] = rowLs[j] + sum
        }
    }

    return initArray
}