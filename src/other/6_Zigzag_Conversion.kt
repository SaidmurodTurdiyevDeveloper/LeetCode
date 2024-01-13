package other



fun convert(s: String, numRows: Int): String {
    if (numRows==1)
        return s
    var l=""
    var before=0
    var after=0
    var index=0
    for (i in 0 until numRows){
        index=i
        before=i*2
        after=(numRows-1-i)*2
        if (index<s.length)
        l+=s[index]
        while (index<s.length){
            if (after!=0){
                index+=after
                if ((index<s.length)){
                    l+=s[index]
                }

            }
            if (before!=0){
                index+=before
                if ((index<s.length)){
                    l+=s[index]
                }
            }
        }
    }
    return l
}
