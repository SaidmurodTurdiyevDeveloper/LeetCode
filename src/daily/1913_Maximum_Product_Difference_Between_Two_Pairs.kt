package daily


fun main(){
    val result= maxProductDifference(intArrayOf(5,6,2,7,4))
    println(result)
}


fun maxProductDifference(nums: IntArray): Int {
    var minOne=0
    var minSecond=0
    var maxOne=0
    var maxSecond=0

    nums.forEach {
        if (it>maxOne){
            maxSecond=maxOne
            maxOne=it
        }else if (maxSecond<it){
            maxSecond=it
        }
        if (it<minOne||minOne==0){
            minSecond=minOne
            minOne=it
        }else if (it<minSecond||minSecond==0){
            minSecond=it
        }
    }

    return maxOne*maxSecond-minOne*minSecond
}