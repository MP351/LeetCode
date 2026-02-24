class MaximumSwap {
    fun maximumSwap(num: Int): Int {
        if (num == 0) {
            return 0
        }

        val list = mutableListOf<Int>()
        var number = num

        while (number > 0) {
            list.add(number % 10)
            number /= 10
        }

        for (i in list.size-1 downTo  0 ) {
            if (list[i] == 9) {
                continue
            }
            var maxElem: Pair<Int, Int> = Pair(0, list[0])

            for (j in 0 until i) {
                if (maxElem.second < list[j]) {
                    maxElem = Pair(j, list[j])
                }
            }
            if (list[i] < maxElem.second) {
                val tmp = list[i]
                list[i] = maxElem.second
                list[maxElem.first] = tmp
                break
            }
        }

        var result = 0
        var multiplier = 1
        list.forEach {
            result += it * multiplier
            multiplier *= 10
        }

        return result
    }
}