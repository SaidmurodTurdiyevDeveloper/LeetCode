package daily


fun largestGoodInteger(num: String): String {
    var number = -1
    var temp = -1
    var index = 0
    while (num.length > index + 2) {
        if (num[index] == num[index + 1] && num[index + 1] == num[index + 2]) {
            temp = num[index].digitToInt()
            if (number < temp) {
                number = temp
            }
        }
        index++
    }
    return if (number >= 0)
        "$number$number$number"
    else
        ""
}