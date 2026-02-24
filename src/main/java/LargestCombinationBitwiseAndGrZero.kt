class LargestCombinationBitwiseAndGrZero {
    fun largestCombination(candidates: IntArray): Int {
        var length = 24
        var numb = 1
        var maxLength = 0

        while (length > 0) {
            length--
            var currentLength = 0

            for (candidate in candidates) {
                if (candidate and numb > 0) {
                    currentLength++
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength
            }

            numb = numb.shl(1)
        }

        return maxLength
    }
}