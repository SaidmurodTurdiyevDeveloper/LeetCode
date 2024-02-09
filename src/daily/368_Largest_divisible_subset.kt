package daily


fun largestDivisibleSubset(nums: IntArray): List<Int> {
    val temp=nums.toList().sorted()
    var maxIndex=0
    val lengths=ArrayList<Int>()
    val prevIndex=ArrayList<Int>()
    for (i in 0 until temp.size){
        lengths.add(1)
        prevIndex.add(-1)
        for ( j in 0 until i){
            if (temp[i]%temp[j]==0){
                if (lengths[i]<1+lengths[j]){
                    lengths[i]=1+lengths[j]
                    prevIndex[i]=j
                }
            }
        }
        if (lengths[maxIndex]<lengths[i])
            maxIndex=i
    }
    val ls=ArrayList<Int>()
    while (maxIndex!=-1){
        ls.add(0,temp[maxIndex])
        maxIndex=prevIndex[maxIndex]
    }
    return ls
}


