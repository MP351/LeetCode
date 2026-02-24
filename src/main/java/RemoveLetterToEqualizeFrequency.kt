import kotlin.math.abs

class RemoveLetterToEqualizeFrequency {
    fun equalFrequency(word: String): Boolean {
        val map = IntArray(26)
        word.forEach {
            map[it.code - 'a'.code]++
        }
        val listMap = map.filter { it != 0 }.toMutableList()

        for (i in 0 until listMap.size) {
            listMap[i]--
            if (equalCount(listMap)) {
                return true
            }

            listMap[i]++
        }

        return false
    }

    private fun equalCount(count: List<Int>): Boolean {
        var c = 0

        for (i in count) {
            if (i == 0) {
                continue
            } else if (c == 0) {
                c = i
            } else if (c == i) {
                continue
            } else {
                return false
            }
        }

        return true
    }
}