package other


fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    var i = 0
    val lastI = nums.size - 4

    var j: Int
    val lastJ = nums.size - 3

    var k: Int
    var lastK = nums.size - 2

    var l: Int
    var lastL = nums.size - 1
    val temp = nums.sorted()
    val ls = ArrayList<List<Int>>()
    while (i <= lastI) {
        j = i + 1
        k = i + 2
        l = i + 3
        if (temp[i].toLong() + temp[j].toLong() + temp[k].toLong() + temp[l].toLong() > target.toLong()) {
            return ls.toList()
        } else {
            while (j <= lastJ) {
                k = j + 1
                l = j + 2
                if (temp[i].toLong() + temp[j].toLong() + temp[k].toLong() + temp[l].toLong() > target.toLong()) {
                    j = lastJ
                } else {
                    while (k <= lastK) {
                        l = k + 1
                        if (temp[i].toLong() + temp[j].toLong() + temp[k].toLong() + temp[l].toLong() > target.toLong()) {
                            if (j == i + 1)
                                lastK = k
                            k = lastK
                        } else {
                            while (l <= lastL) {
                                if (temp[i].toLong() + temp[j].toLong() + temp[k].toLong() + temp[l].toLong() > target.toLong()) {
                                    if (k == i + 2)
                                        lastL = l
                                    l = lastL
                                } else if (temp[i].toLong() + temp[j].toLong() + temp[k].toLong() + temp[l].toLong() == target.toLong()) {
                                    if (!ls.contains(listOf(temp[i], temp[j], temp[k], temp[l])))
                                        ls.add(listOf(temp[i], temp[j], temp[k], temp[l]))
                                }
                                l++
                            }
                        }
                        k++
                    }
                }
                j++
            }
        }
        i++
    }

    return ls.toList()
}