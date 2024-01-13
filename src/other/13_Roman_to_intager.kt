package other


fun romanToInt(s: String): Int {
    var number=0
    var before=s.first()
    s.forEach {
        number += when(it){
            'M' -> if(before!='C')1000 else 800
            'D' -> if(before!='C')500 else 300
            'C' -> if(before!='X')100 else 80
            'L' -> if(before!='X')50 else 30
            'X' -> if(before!='I')10 else 8
            'V' -> if(before!='I')5 else 3
            else-> 1
        }
        before=it
    }
    return number
}