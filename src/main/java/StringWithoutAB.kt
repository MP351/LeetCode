import kotlin.math.min

class StringWithoutAB {
    fun strWithout3a3b(a: Int, b: Int): String {
        return generate(a, b, "a", "b")
    }

    private fun generate(a: Int, b: Int, aa: String, bb: String): String {
        if (a < b) {
            return generate(b, a, bb, aa)
        }
        if (b == 0) {
            return aa.repeat(a)
        }
        val useA = min(2, a)
        val useB = if (a - 2 >= b) 1 else 0

        return aa.repeat(useA) + bb.repeat(useB) + generate(a - useA, b - useB, aa, bb)
    }
}