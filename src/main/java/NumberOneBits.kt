class NumberOneBits {
    fun hammingWeight(n: Int): Int {
        if (n == 0) {
            return 0
        }

        return (n and 1) + hammingWeight(n.ushr(1))
    }
}