package daily


fun findErrorNums(nums: IntArray): IntArray {
    val temp = nums.toList().sorted()

    var startIndex = temp.first()
    var dublicatNumber = 0
    var errorNumber = 0
    if (temp.size == 2) {
        return if (temp.first() > 1) {
            intArrayOf(temp.first(), temp.first() - 1)
        } else intArrayOf(temp.first(), temp.last() + 1)
    }
    if (temp.first() == temp[1]) {
       if (temp[2] - temp.first() == 2) {
           return intArrayOf(temp.first(), temp.first() + 1)
        } else {
            dublicatNumber=temp.first()
       }
    }
    for (i in 0 until temp.size) {
        if (errorNumber == 0) {
            if (temp[i] != startIndex + i) {
                if (i < temp.size - 1) {
                    if (temp[i + 1] == startIndex + i) {
                        startIndex -= 1
                    } else
                        errorNumber = startIndex + i
                } else
                    errorNumber = startIndex + i + 1
            }
        }

        if (i > 0 && temp[i - 1] == temp[i]) {
            dublicatNumber = temp[i]
        }

    }
    if (errorNumber == 0) {
        return if (temp.first() > 1)
            intArrayOf(dublicatNumber, temp.first() - 1)
        else intArrayOf(dublicatNumber, temp.last() + 1)
    }
    return intArrayOf(dublicatNumber, errorNumber)
}