import java.math.BigInteger

class SumOfDigitsOfStringAfterConvert {
    fun getLucky(s: String, k: Int): Int {
        val charArray = s.toCharArray()
        var acc = 0

        for (i in charArray.indices) {
            val num = charArray[i].code - 96
            if (num > 9) {
                acc += num / 10
                acc += num % 10
            } else {
                acc += num
            }
        }

        var transformed = acc
        for (i in 2..k) {
            transformed = transformInt(transformed)
        }

        return transformed
    }

    private fun transformInt(int: Int): Int {
        val result = int % 10
        val reduced = int / 10

        return if (reduced == 0) {
            result
        } else {
            result + transformInt(reduced)
        }
    }

    fun getLuckyBigInteger(s: String, k: Int): Int {
        val charArray = s.toCharArray()
        var int = BigInteger.valueOf(0)
        val nine = BigInteger.valueOf(9)
        val hundred = BigInteger.valueOf(100)
        val ten = BigInteger.valueOf(10)

        var multiplier = BigInteger.valueOf(1)

        for (i in charArray.size-1 downTo 0) {
            val number = BigInteger.valueOf(charArray[i].code - 96L)
            int += number * multiplier

            multiplier = if (number > nine) {
                multiplier * hundred
            } else {
                multiplier * ten
            }
        }

        var transformed = int
        for (i in 1..k) {
            transformed = transform(transformed)
        }

        return transformed.toInt()
    }

    private fun transform(int: BigInteger): BigInteger {
        val result = int.remainder(BigInteger.valueOf(10))
        val reduced = int.divide(BigInteger.valueOf(10))

        return if (reduced == BigInteger.ZERO) {
            result
        } else {
            result + transform(reduced)
        }
    }
}