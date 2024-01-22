package other

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0 || s.isEmpty())
        return false
    var temp = ArrayList<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> {
                temp += it
            }

            ')' -> {
                if (temp.isEmpty())
                    return false
                if (temp.last() != '(')
                    return false
               if (temp.size == 1)
                    temp.clear()
                else
                    temp.removeAt(temp.size-1)
            }

            '}' -> {
                if (temp.isEmpty())
                    return false
                if (temp.last() != '{')
                    return false
                if (temp.size == 1)
                    temp.clear()
                else
                    temp.removeAt(temp.size-1)
            }

            ']' -> {
                if (temp.isEmpty())
                    return false
                if (temp.last() != '[')
                    return false
                if (temp.size == 1)
                    temp.clear()
                else
                    temp.removeAt(temp.size-1)
            }

            else -> {}
        }
    }
    return temp.isEmpty()
}

