import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class RemoveLetterToEqualizeFrequencyTest {
    @Test
    fun test1() {
        val input = "abcc"
        val result = RemoveLetterToEqualizeFrequency().equalFrequency(input)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val input = "abc"
        val result = RemoveLetterToEqualizeFrequency().equalFrequency(input)
        assertTrue(result)
    }

    @Test
    fun test3() {
        val input = "bbac"
        val result = RemoveLetterToEqualizeFrequency().equalFrequency(input)
        assertTrue(result)
    }

    @Test
    fun test4() {
        val input = "aca"
        val result = RemoveLetterToEqualizeFrequency().equalFrequency(input)
        assertTrue(result)
    }

    @Test
    fun test5() {
        val input = "abbcc"
        val result = RemoveLetterToEqualizeFrequency().equalFrequency(input)
        assertTrue(result)
    }
}