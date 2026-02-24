class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        if (s.isBlank()) {
            return true
        }
        var forwardCounter = 0
        var backwardsCounter = s.length - 1

        while (backwardsCounter > forwardCounter) {
            if (!Character.isLetterOrDigit(s[forwardCounter])) {
                forwardCounter++
                continue
            }
            if (!Character.isLetterOrDigit(s[backwardsCounter])) {
                backwardsCounter--
                continue
            }

            if (s[forwardCounter++].lowercaseChar() != s[backwardsCounter--].lowercaseChar()) {
                return false
            }
        }

        return true
    }

}