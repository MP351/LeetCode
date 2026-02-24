class PowerOfFour {
    fun isPowerOfFour(n: Int): Boolean {
        println(n.toString(2))
        return (n > 0 && (n and (n - 1)) == 0) && checkZeroes(n)
    }

    private fun checkZeroes(n: Int): Boolean {
        var count = 0
        var num = n
        while (num > 1) {
            num = num.ushr(1)
            count++
        }

        return count % 2 == 0
    }
}