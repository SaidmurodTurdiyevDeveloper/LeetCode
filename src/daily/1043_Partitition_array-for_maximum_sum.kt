import kotlin.math.max

fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
    val ls=Array(arr.size){
        0
    }
    for (i in 0 until arr.size){
        var m=0
        var j=1
        while (j<=k&&(i-j+1)>=0){
            m= max(m,arr[i-j+1])
            ls[i]=max(ls[i],((if(i>=j)ls[i-j] else 0)+m*j))
            j++
        }
    }
    return ls[arr.size-1]
}

