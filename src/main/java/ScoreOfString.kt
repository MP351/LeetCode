import kotlin.math.absoluteValue

class ScoreOfString {
    fun scoreOfString(s: String): Int {
        var sum = 0
        for (i in 0..s.length-2) {
            sum += (s[i].code - s[i+1].code).absoluteValue
        }

        return sum
    }
}