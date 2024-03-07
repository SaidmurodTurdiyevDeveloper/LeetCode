package daily

data class DataTrust(var isTrustAnOne: Boolean = false, var trustPersonCount: Int = 0)

fun findJudge(n: Int, trust: Array<IntArray>): Int {
    val person=Array(n){
        DataTrust()
    }
    trust.forEach {
        person[it.first()-1].isTrustAnOne=true
        person[it[1]-1].trustPersonCount++
    }
    person.forEachIndexed { index, b ->
        if (!b.isTrustAnOne&&b.trustPersonCount==n-1){
            return index+1
        }
    }
    return -1
}