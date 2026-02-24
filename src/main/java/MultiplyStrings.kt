class MultiplyStrings {
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") {
            return "0"
        }

        var sb = StringBuilder("0")

        val longest: String
        val shortest: String

        if (num1.length > num2.length) {
            longest = num1
            shortest = num2
        } else {
            longest = num2
            shortest = num1
        }

        var multiplier = ""
        for (i in shortest.length-1 downTo 0) {
            val result = "${simpleMultiply(longest, shortest[i])}$multiplier"
            multiplier += "0"
            val resultAdd = add(sb.toString(), result)
            sb = StringBuilder(resultAdd)
        }


        return sb.toString()
    }

    fun simpleMultiply(number: String, symbol: Char): String {
        if (symbol == '0') {
            return "0"
        }
        val sb = StringBuilder()
        var cache = 0

        for (i in number.length-1 downTo 0) {
            cache += (number[i].code - '0'.code) * (symbol.code - '0'.code)
            sb.insert(0, cache % 10)
            cache /= 10
        }

        if (cache > 0) {
            sb.insert(0, cache)
        }

        return sb.toString()
    }

    fun add(number1: String, number2: String): String {
        val sb = StringBuilder()
        var cache = 0
        val longest: String
        val shortest: String

        if (number1.length > number2.length) {
            longest = number1
            shortest = number2
        } else {
            longest = number2
            shortest = number1
        }

        var longCounter = longest.length
        var shortCounter = shortest.length

        while (--longCounter > -1) {
            val shortSymbol = if (shortCounter < 1) {
                '0'
            } else {
                shortest[--shortCounter]
            }

            cache += (longest[longCounter].code - '0'.code) + (shortSymbol.code - '0'.code)
            sb.insert(0, cache % 10)
            cache /= 10
        }

        if (cache > 0) {
            sb.insert(0, cache)
        }

        return sb.toString()
    }
}