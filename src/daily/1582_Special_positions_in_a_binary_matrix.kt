package daily

/**
 * 1582. Special Positions in a Binary Matrix

Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in
row i and column j are 0 (rows and columns are 0-indexed).
Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
 */



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