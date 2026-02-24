import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class RotateStringTest {
    @Test
    fun test1() {
        val s = "abcde"
        val goal = "cdeab"
        val result = RotateString().rotateString(s, goal)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val s = "abcde"
        val goal = "abced"
        val result = RotateString().rotateString(s, goal)
        assertFalse(result)
    }

    @Test
    fun test3() {
        val s = "a"
        val goal = "a"
        val result = RotateString().rotateString(s, goal)
        assertTrue(result)
    }
}