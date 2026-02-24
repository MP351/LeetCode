class MinimumArrayEnd {
    fun minEnd(n: Int, x: Int): Long {
        return toArrayAndBack(n, x)
    }

    private fun toArrayAndBack(n: Int, x: Int): Long {
        var m = n - 1
        val arrayN = mutableListOf<Int>()

        while (m > 0) {
            val lastBit = if (m and 1 == 1) {
                1
            } else {
                0
            }
            arrayN.add(lastBit)
            m = m.ushr(1)
        }

        val arrayX = mutableListOf<Int>()
        var xx = x
        while (xx > 0) {
            val lastBit = if (xx and 1 == 1) {
                1
            } else {
                0
            }
            arrayX.add(lastBit)
            xx = xx.ushr(1)
        }

        var counterX = 0
        var counterN = 0
        while (counterN < arrayN.size) {
            if (counterX < arrayX.size) {
                if (arrayX[counterX] == 0) {
                    arrayX[counterX] = arrayN[counterN++]
                }
            } else {
                arrayX.add(arrayN[counterN++])
            }
            counterX++
        }

        var result: Long = 0

        arrayX.reverse()
        for (elem in arrayX) {
            result = result.shl(1)
            result += elem
        }

        return result
    }
}