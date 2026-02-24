class RotateString {
    fun rotateString(s: String, goal: String): Boolean {
        if (s == goal) {
            return true
        }

        val sb = StringBuilder(s)
        for (i in s.indices) {
            sb.append(sb[0])
            sb.deleteAt(0)

            if (sb.toString() == goal) {
                return true
            }
        }

        return false
    }
}