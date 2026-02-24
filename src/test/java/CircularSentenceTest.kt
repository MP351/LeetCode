import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class CircularSentenceTest {
    @Test
    fun test1() {
        val sentence = "leetcode exercises sound delightful"
        val result = CircularSentence().isCircularSentence(sentence)
        assertTrue(result)
    }

    @Test
    fun test2() {
        val sentence = "eetcode"
        val result = CircularSentence().isCircularSentence(sentence)
        assertTrue(result)
    }

    @Test
    fun test3() {
        val sentence = "Leetcode is cool"
        val result = CircularSentence().isCircularSentence(sentence)
        assertFalse(result)
    }
}