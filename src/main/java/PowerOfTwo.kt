import kotlin.math.log2

class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
//        if (n < 0) {
//            return false
//        }
//        val result = log2(n.toDouble())
//        return ((result - result.toInt()) * 100000000000000).toInt() == 0
        return n > 0 && (n and (n - 1)) == 0
    }
}