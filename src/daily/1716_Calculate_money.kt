package daily


fun totalMoney(n: Int): Int {
    val count: Int = n / 7
    val qoldiq: Int = n % 7
    return 28 * count + (if (count > 1) ((7 * (1 + (count - 1)) * (count - 1) / 2)) else 0) + ((1 + qoldiq + 2 * count) * qoldiq) / 2
}