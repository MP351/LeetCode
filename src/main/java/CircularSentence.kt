class CircularSentence {
    fun isCircularSentence(sentence: String): Boolean {
        if (sentence[0] != sentence[sentence.length-1]) {
            return false
        }

        for (i in sentence.indices) {
            if (sentence[i] == ' ' && sentence[i-1] != sentence[i+1]) {
                return false
            }
        }

        return true
    }
}