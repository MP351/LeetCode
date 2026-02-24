import org.junit.Assert.assertEquals
import org.junit.Test

class MaximumSwapTest {
    @Test
    fun test1() {
        val input = 2736
        val expected = 7236
        val result = MaximumSwap().maximumSwap(input)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = 9973
        val expected = 9973
        val result = MaximumSwap().maximumSwap(input)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val input = 13
        val expected = 31
        val result = MaximumSwap().maximumSwap(input)
        assertEquals(expected, result)
    }

    @Test
    fun test5() {
        val input = 9
        val expected = 9
        val result = MaximumSwap().maximumSwap(input)
        assertEquals(expected, result)
    }

    @Test
    fun test6() {
        val input = 1993
        val expected = 9
        val result = MaximumSwap().maximumSwap(input)
        assertEquals(expected, result)
    }
}