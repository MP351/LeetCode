class CountNumbersConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val allowedSet = BooleanArray(26)
        for (char in allowed) {
            allowedSet[char.code - 'a'.code] = true
        }

        var count = words.size
        for (i in words.indices) {
            for (j in words[i].indices) {
                if (!allowedSet[words[i][j].code - 'a'.code]) {
                    count--
                    break
                }
            }
        }

        return count
    }
}