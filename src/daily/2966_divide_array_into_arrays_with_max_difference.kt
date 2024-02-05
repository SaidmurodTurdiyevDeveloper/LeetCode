package daily

fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
    val temp = nums.sorted()

    val ls=ArrayList<IntArray>()
    var i = 0
    while ((i + 2) < nums.size) {
        if (temp[i] + k >= temp[i + 2]) {
            ls.add(intArrayOf(temp[i],temp[i+1],temp[i+2]))
            i += 3
        }
        else
            return arrayOf()
    }
    val array = Array(ls.size){
        ls[it]
    }
    return array
}