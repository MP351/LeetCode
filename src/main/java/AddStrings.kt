class AddStrings {
    fun addStrings(number1: String, number2: String): String {
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