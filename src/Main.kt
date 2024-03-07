import daily.*


fun main() {
    val result = findCheapestPrice(
        4,
        arrayOf(
            intArrayOf(0,1,100),
            intArrayOf(1,2,100),
            intArrayOf(2,0,100),
            intArrayOf(1,3,600),
            intArrayOf(2,3,200)
        ),
        0,3,1
    )
    println(result)
}



