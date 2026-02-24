import java.util.TreeSet
import kotlin.math.min

class LongestHappyString {
    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        return generate(a, b, c, "a", "b", "c")
    }

    private fun generate(a: Int, b: Int, c: Int, aa: String, bb: String, cc: String): String {
        if (a < b) {
            return generate(b, a, c, bb, aa, cc)
        }
        if (b < c) {
            return generate(a, c, b, aa, cc, bb)
        }
        if (b == 0) {
            return aa.repeat(min(2, a))
        }

        val useA = min(2, a)
        val useB = if (a - 2 >= b) 1 else 0

        return aa.repeat(useA) + bb.repeat(useB) + generate(a - useA, b - useB, c, aa, bb, cc)
    }
}