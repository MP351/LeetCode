class StringCompression3 {
    fun compressedString(word: String): String {
        val sb = StringBuilder()
        var counter = 0
        var lastSymbol = word[0]

        for (symbol in word) {
            if (symbol == lastSymbol) {
                counter++
                if (counter == 9) {
                    sb.append("$counter$lastSymbol")
                    counter = 0
                }
                continue
            }

            if (counter > 0) {
                sb.append("$counter$lastSymbol")
            }

            lastSymbol = symbol
            counter = 1
        }

        if (counter > 0) {
            sb.append("$counter$lastSymbol")
        }

        return sb.toString()
    }

}