package daily


class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var returnCount = 0

        words.forEach { char ->
            var temp = chars
            var index = 0
            while (index < char.length) {
                if (temp.contains(char[index]))
                    temp = temp.replaceFirst(char[index].toString(), "")
                else return@forEach
                index++
            }
            returnCount += char.length
        }
        return returnCount
    }
}