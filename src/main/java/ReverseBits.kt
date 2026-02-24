class ReverseBits {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var num = n
        var result = 0

        var counter = 32
        while (counter-- > 0) {
            result = result.shl(1) + num.and(1)
            num = num.ushr(1)
        }

        return result
    }
}