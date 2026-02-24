import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumStringLengthAfterRemovingSubstringTest {
    @Test
    fun test1() {
        val input = "ABFCACDB"
        val expected = 2
        val result = MinimumStringLengthAfterRemovingSubstring().minLength(input)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = "ACBBD"
        val expected = 5
        val result = MinimumStringLengthAfterRemovingSubstring().minLength(input)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = "A"
        val expected = 1
        val result = MinimumStringLengthAfterRemovingSubstring().minLength(input)
        assertEquals(expected, result)
    }
}