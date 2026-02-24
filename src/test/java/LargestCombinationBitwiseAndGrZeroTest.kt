import org.junit.Assert.assertEquals
import org.junit.Test

class LargestCombinationBitwiseAndGrZeroTest {
    @Test
    fun test1() {
        val candidates = intArrayOf(16,17,71,62,12,24,14)
        val expected = 4
        val result = LargestCombinationBitwiseAndGrZero().largestCombination(candidates)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val candidates = intArrayOf(8,8)
        val expected = 2
        val result = LargestCombinationBitwiseAndGrZero().largestCombination(candidates)
        assertEquals(expected, result)
    }
}