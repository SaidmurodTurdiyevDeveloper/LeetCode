package daily

fun destCity(paths: List<List<String>>): String {
    var isExist: Boolean

    paths.forEach{ls->
        isExist=false
        paths.forEach{lsSearch->
            if(ls[1]==lsSearch[0])
                isExist=true
        }
        if(!isExist){
            return ls[1]
        }
    }
    return paths[0][1]
}