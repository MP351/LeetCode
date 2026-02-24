import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MaximumXORForEachQueryTest {
    @Test
    fun test1() {
        val input = intArrayOf(0,1,1,3)
        val maxBit = 2
        val expected = intArrayOf(0,3,2,3)
        val result = MaximumXORForEachQuery().getMaximumXor(input, maxBit)

        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2,3,4,7)
        val maxBit = 3
        val expected = intArrayOf(5,2,6,5)
        val result = MaximumXORForEachQuery().getMaximumXor(input, maxBit)

        assertArrayEquals(expected, result)
    }
}