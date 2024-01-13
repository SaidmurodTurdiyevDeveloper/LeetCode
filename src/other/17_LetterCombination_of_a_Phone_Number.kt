package other


fun letterCombinations(digits: String): List<String> {
    var ls = ArrayList<String>()
    digits.forEach { symbol ->
        if (ls.isEmpty())
            ls.addAll(getLetter(symbol, ""))
        else {
            val newLs = ArrayList<String>()
            ls.forEach { text ->
                newLs.addAll(getLetter(symbol, text))
            }
            ls = newLs
        }
    }
    return ls
}

fun getLetter(symbol: Char, text: String): List<String> {
    val ls = ArrayList<String>()
    when (symbol) {
        '2' -> {
            ls.add("${text}a")
            ls.add("${text}b")
            ls.add("${text}c")
        }

        '3' -> {
            ls.add("${text}d")
            ls.add("${text}e")
            ls.add("${text}f")
        }

        '4' -> {
            ls.add("${text}g")
            ls.add("${text}h")
            ls.add("${text}i")
        }

        '5' -> {
            ls.add("${text}j")
            ls.add("${text}k")
            ls.add("${text}l")
        }

        '6' -> {
            ls.add("${text}m")
            ls.add("${text}n")
            ls.add("${text}o")
        }

        '7' -> {
            ls.add("${text}p")
            ls.add("${text}q")
            ls.add("${text}r")
            ls.add("${text}s")
        }

        '8' -> {
            ls.add("${text}t")
            ls.add("${text}u")
            ls.add("${text}v")
        }

        '9' -> {
            ls.add("${text}w")
            ls.add("${text}x")
            ls.add("${text}y")
            ls.add("${text}z")
        }
    }
    return ls
}