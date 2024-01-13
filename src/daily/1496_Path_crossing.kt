package daily



fun isPathCrossing(path: String): Boolean {
    val set = HashSet<String>(path.length+1)
    var i=0
    var j=0
    set.add("0:0")
    path.forEach {
        when(it){
            'N'->i++
            'W'->j--
            'S'->i--
            'E'->j++
            else->{}
        }
        if (!set.add("$i:$j")){
            return true
        }
    }
    return false
}
