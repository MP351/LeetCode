class SeparateBlackWhite {
    fun minimumSteps(s: String): Long {
        var count = 0L
        var answer = 0L
        for (i in s.length-1 downTo 0) {
            if (s[i] == '1') {
                answer += count
            } else {
                count++
            }
        }

        return answer
    }
}