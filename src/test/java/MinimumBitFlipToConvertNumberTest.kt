import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumBitFlipToConvertNumberTest {
    @Test
    fun test1() {
        val start = 10
        val goal = 7
        val expected = 3
        val result = MinimumBitFlipToConvertNumber().minBitFlips(start, goal)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val start = 3
        val goal = 4
        val expected = 3
        val result = MinimumBitFlipToConvertNumber().minBitFlips(start, goal)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val start = 0
        val goal = 2
        val expected = 1
        val result = MinimumBitFlipToConvertNumber().minBitFlips(start, goal)
        assertEquals(expected, result)
    }
}