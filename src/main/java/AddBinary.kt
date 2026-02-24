import kotlin.text.StringBuilder

class AddBinary {
    val sb = StringBuilder()
    fun addBinary(a: String, b: String,): String {
        val longest: String
        val shortest: String
        if (a.length > b.length) {
            longest = a
            shortest = b
        } else {
            longest = b
            shortest = a
        }
        var longestCounter = longest.length
        var shortestCounter = shortest.length
        var floatingNumber = false

        while (true) {
            --longestCounter
            --shortestCounter

            if (longestCounter < 0 && !floatingNumber) {
                break
            }

            if (shortestCounter < 0 && longestCounter > -1) {
                floatingNumber = calc(longest[longestCounter] == '1', floatingNumber)
                continue
            } else if (longestCounter < 0 && shortestCounter < 0){
                calc(num1 = true, false)
                break
            }

            val num1 = longest[longestCounter] == '1'
            val num2 = shortest[shortestCounter] == '1'
            val result = num1.xor(num2)

            sb.insert(0, toStr(result.xor(floatingNumber)))
            floatingNumber = result && floatingNumber || (num1 && num2)
        }

        return sb.toString()
    }

    private fun calc(num1: Boolean, num2: Boolean, floatingNumber: Boolean = false): Boolean {
        val result = num1.xor(num2)

        sb.insert(0, toStr(result.xor(floatingNumber)))
        return result && floatingNumber || (num1 && num2)
    }

    private fun toStr(boolean: Boolean): Char {
        return if (boolean) {
            '1'
        } else {
            '0'
        }
    }
}