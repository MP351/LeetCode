class Sqrt {
    fun mySqrt(x: Int): Int {
        return bin(x)
    }

    private fun bin(x: Int): Int {
        if (x == 0 || x == 1) {
            return x
        }

        if (x == 2) {
            return 1
        }

        var top = 2L
        var topI = 1

        var i = 2
        while (top < x) {
            topI = i
            top = i * i.toLong()

            if (top == x.toLong()) {
                return i
            }

            i *= 2
        }

        var bottomI = topI / 2
        while (topI - bottomI != 1) {
            val newTopI = topI - ((topI - bottomI) / 2)
            val result: Long = newTopI * newTopI.toLong()

            if (result == x.toLong()) {
                return newTopI
            }

            if (result > x) {
                topI = newTopI
            } else {
                bottomI = newTopI
            }
        }

        return bottomI
    }

    private fun brute(x: Int): Int {
        if (x == 0) {
            return 0
        }
        var lastResult = 1

        for (i in 1..Int.MAX_VALUE) {
            val result = i * i
            if (result == x) {
                return i
            }

            if (x in lastResult until result) {
                return i - 1
            }

            if (result < 0) {
                return i - 1
            }

            lastResult = result
        }

        return 0
    }
}