class MinimumStringLengthAfterRemovingSubstring {
    fun minLength(s: String): Int {
        val sb = StringBuilder(s)

        var counter = 0
        while (counter < sb.length - 1) {
            if (sb[counter] == 'A' && sb[counter + 1] == 'B') {
                sb.delete(counter, counter + 2)
                counter = 0
                continue
            } else if (sb[counter] == 'C' && sb[counter+1] == 'D') {
                sb.delete(counter, counter + 2)
                counter = 0
            } else {
                counter++
            }
        }

        return sb.length
    }
}