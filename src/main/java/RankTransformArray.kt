class RankTransformArray {
    fun arrayRankTransform(arr: IntArray): IntArray {
        val result = IntArray(arr.size)
        if (arr.isEmpty()) {
            return result
        }
        val sorted = Array(arr.size) {
            Pair(it, arr[it])
        }
        sorted.sortBy { it.second }

        var prev = sorted.first().second
        var rank = 1
        sorted.forEach { elem ->
            if (prev == elem.second) {
                result[elem.first] = rank
            } else {
                result[elem.first] = ++rank
            }
            prev = elem.second
        }

        return result
    }
}