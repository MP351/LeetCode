class AddToArrayFormInteger {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val result = MutableList(num.size) { 0 }
        var number = k
        var i = num.size - 1
        var extra: Int

        while (i >= 0) {
            num[i] += (number % 10)
            if (num[i] > 9) {
                extra = 1
                num[i] %= 10
            } else {
                extra = 0
            }
            result[i] = num[i]

            i--
            number = number / 10 + extra
        }
        if (number > 0) {
            while (number > 0) {
                result.add(0, number % 10)
                number /= 10
            }
        }

        return result
    }
}