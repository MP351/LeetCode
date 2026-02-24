class DeleteCharactersFancyString {
    fun makeFancyString(s: String): String {
        val sb = StringBuilder()
        var lastChar = s[0]
        var counter = 0

        s.forEach {
            if (lastChar != it) {
                sb.append(it)
                counter = 1
            } else if (counter < 2){
                sb.append(it)
                counter++
            }
            lastChar = it
        }
        return sb.toString()
    }
}