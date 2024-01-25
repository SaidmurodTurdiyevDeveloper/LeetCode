package other

//data class Parenthesis(var text: String, var openCount: Int, val closeCount: Int)
//
//fun generateParenthesis(n: Int): List<String> {
//    var count = 0
//    val ls = ArrayList<Parenthesis>()
//    while (count < n * 2) {
//        if (ls.isEmpty()) {
//            ls.add(Parenthesis("(", n - 1, n))
//        } else {
//            val size = ls.size
//            for (i in 0 until size) {
//                val d = ls[i]
//                if (d.openCount > 0) {
//                    ls[i] = d.copy(text = d.text + '(', openCount = d.openCount - 1)
//                    if (d.openCount < d.closeCount) {
//                        ls.add(d.copy(text = d.text + ')', closeCount = d.closeCount - 1))
//                    }
//                } else if (d.closeCount > 0) {
//                    ls[i] = d.copy(text = d.text + ')', closeCount = d.closeCount - 1)
//                }
//            }
//        }
//        count++
//    }
//    return ls.map {
//        it.text
//    }
//}