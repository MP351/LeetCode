class MinimumBitFlipToConvertNumber {
    fun minBitFlips(start: Int, goal: Int): Int {
        return customCounterAnd(start, goal)
    }

    private fun libFunc(start: Int, goal: Int): Int {
        return start.xor(goal).countOneBits()
    }

    private fun customCounterAnd(start: Int, goal: Int): Int {
        var xor = start.xor(goal)
        var count = 0
        while (xor > 0) {
            count++
            xor = xor and (xor - 1)
        }
        return count
    }
}