class NumberAfterDoubleReverse {
    fun isSameAfterReversals(num: Int): Boolean {
        return num == reverse(reverse(num))
    }

    private fun reverse(num: Int): Int {
        var n = num
        var result = 0

        while (n > 0) {
            result = (result * 10) + (n % 10)
            n /= 10
        }

        return result
    }
}
