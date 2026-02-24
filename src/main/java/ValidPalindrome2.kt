class ValidPalindrome2 {
    fun validPalindrome(s: String): Boolean {
        if (s.isBlank()) {
            return true
        }
        var forwardCounter = -1
        var backwardsCounter = s.length

        while (backwardsCounter > forwardCounter) {
            if (s[++forwardCounter] != s[--backwardsCounter]) {
                return isPalindrome(s.substring(forwardCounter+1, backwardsCounter+1)) || isPalindrome(s.substring(forwardCounter, backwardsCounter))
            }
        }

        return true
    }

    private fun isPalindrome(s: String): Boolean {
        var forwardCounter = -1
        var backwardsCounter = s.length
        while (backwardsCounter > forwardCounter) {
            if (s[++forwardCounter] != s[--backwardsCounter]) {
                return false
            }
        }
        return true
    }
}