package daily


fun maxLength(arr: List<String>): Int {
    var result = 0
    for (i in 0 until  arr.size) {
        val ls = ArrayList<String>()
        ls.add(arr[i])
        if (isUnique(text = arr[i])) {
            for (j in arr.size - 1 downTo 0) {
                val size=ls.size
                if (isUnique(arr[j])){
                    for (k in 0 until size){
                        if (isCanAdd(arr[j],ls[k])){
                            ls.add(ls[k]+arr[j])
                        }
                    }
                }
            }
            var max=arr[i].length
            ls.forEach {
                if (max<it.length){
                    max=it.length
                }
            }
            if (max > result) {
                result = max
                if (result==26)
                    return 26
            }
        }

    }
    return result
}

fun isCanAdd(txtFirst: String, txtSecond: String): Boolean {
    for (i in 0 until txtFirst.length) {
        for (j in 0 until txtSecond.length) {
            if (txtFirst[i] == txtSecond[j])
                return false
        }
    }
    return true
}

fun isUnique(text: String): Boolean {
    return text.toSet().size == text.length
}