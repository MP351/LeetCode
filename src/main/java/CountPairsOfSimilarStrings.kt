class CountPairsOfSimilarStrings {
    private val alphabet = IntArray(26)
    init {
        for (i in 0..25) {
            alphabet[i] = (1).shl(i)
        }
    }

    fun similarPairs(words: Array<String>): Int {
        var count = ((words.size -1) * words.size / 2.0).toInt()

        val bitMap = IntArray(words.size)
        for (i in words.indices) {
            for (char in words[i]) {
                bitMap[i] = bitMap[i] or alphabet[char.code - 'a'.code]
            }
        }

        for (i in bitMap.indices) {
            for (j in i+1 until bitMap.size) {
                if (bitMap[i] xor bitMap[j] != 0) {
                    count--
                }
            }
        }

        return count
    }

}