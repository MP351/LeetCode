import org.junit.Assert.assertEquals
import org.junit.Test

class SeparateBlackWhiteTest {
    @Test
    fun test1() {
        val input = "101"
        val output = 1L
        val result = SeparateBlackWhite().minimumSteps(input)
        assertEquals(output, result)
    }

    @Test
    fun test2() {
        val input = "100"
        val output = 2L
        val result = SeparateBlackWhite().minimumSteps(input)
        assertEquals(output, result)
    }

    @Test
    fun test3() {
        val input = "0111"
        val output = 0L
        val result = SeparateBlackWhite().minimumSteps(input)
        assertEquals(output, result)
    }
}