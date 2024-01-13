package other

fun main(){

}

fun searchRange(nums: IntArray, target: Int): IntArray {
    var startIndex=0
    var untilIndex=nums.size-1

    val returnArray= IntArray(2)
    returnArray[0]=-1
    returnArray[1]=-1

    var index=untilIndex/2
    var cond= nums.isNotEmpty()

    while(cond){
        if(target==nums[index]){
            println("find $index")
            var i=index
            var j=index
            while(i>0&&nums[i-1]==target){
                i--
            }
            while((j<nums.size-1)&&nums[j+1]==target){
                j++
            }
            returnArray[0]=i
            returnArray[1]=j
            return returnArray
        }else if(target>nums[index]){
            startIndex=index
            index=(untilIndex+startIndex)/2
            cond=(startIndex+1)<untilIndex
        }else{
            untilIndex=index
            index=(untilIndex+startIndex)/2
            cond=startIndex<(untilIndex-1)
        }
    }
    if(nums[0]==target){
        returnArray[0]=0
        returnArray[1]=0
        return returnArray
    }
    if(nums[nums.size-1]==target){
        returnArray[0]=nums.size-1
        returnArray[1]=nums.size-1
        return returnArray
    }
    return returnArray
}

fun lengthOfLongestSubstring(s: String): Int {
    var maxLine=""
    var returnCount=0
    for(i in s.indices){
        var j=1
        maxLine= s[i].toString()
        while(((j+i)<s.length)&&!maxLine.contains(s[i+j])){
            maxLine+=s[i+j]
            j++
        }
        if(j>returnCount){
            returnCount=j
        }
    }
    return returnCount
}

fun minOperations(nums: IntArray): Int {
    var min=nums[0]

    for(i in nums.indices){
        if(nums[i]<min){
            min=nums[i]
        }
    }
    var replaceCount= findCount(nums, startValue = min)
    for(i in nums.indices){
        val count= findCount(nums, startValue = nums[i])
        if (replaceCount>count)
            replaceCount=count
    }
    return replaceCount
}

fun findCount(nums: IntArray,startValue:Int):Int{
    var count=0
    var value=startValue
    for(i in nums.indices){
        if(!isExist(nums,value)){
            count++
        }
        value++
    }
    return count
}

fun isExist(nums: IntArray,target:Int):Boolean{
    for(i in nums.indices){
        if(nums[i]==target){
            return true
        }
    }
    return false
}