package daily

fun main() {
    val result = buyChoco(intArrayOf(1, 2, 2,5), 3)
    println(result)
}

fun buyChoco(prices: IntArray, money: Int): Int {

    var amount = -1
    var firstMin = prices[0]
    var secondMin = prices[1]
    for (i in 1 until prices.size) {
        if (prices[i] < firstMin) {
            secondMin = firstMin
            firstMin = prices[i]
        } else if (prices[i] < secondMin) {
            secondMin = prices[i]
        }
    }
    amount = money - firstMin - secondMin
    if (amount >= 0)
        return amount
    else return money
}