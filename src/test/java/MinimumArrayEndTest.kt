import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumArrayEndTest {
    @Test
    fun test1() {
        val n = 3
        val x = 4
        val expected = 6L
        val result = MinimumArrayEnd().minEnd(n, x)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val n = 2
        val x = 7
        val expected = 15L
        val result = MinimumArrayEnd().minEnd(n, x)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val n = 100000000
        val x = 100000000
        val expected = 409632367103L
        val result = MinimumArrayEnd().minEnd(n, x)
        assertEquals(expected, result)
    }
}