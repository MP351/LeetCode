import org.junit.Assert.assertEquals
import org.junit.Test

class ScoreOfStringTest {
    @Test
    fun test1() {
        val input = "hello"
        val expected = 13
        val result = ScoreOfString().scoreOfString(input)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = "zaz"
        val expected = 50
        val result = ScoreOfString().scoreOfString(input)
        assertEquals(expected, result)
    }
}