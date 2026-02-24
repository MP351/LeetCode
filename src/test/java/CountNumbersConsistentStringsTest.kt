import org.junit.Assert.assertEquals
import org.junit.Test

class CountNumbersConsistentStringsTest {
    @Test
    fun test1() {
        val allowed = "ab"
        val words = arrayOf("ad","bd","aaab","baa","badab")
        val expected = 2
        val result = CountNumbersConsistentStrings().countConsistentStrings(allowed, words)

        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val allowed = "abc"
        val words = arrayOf("a","b","c","ab","ac","bc","abc")
        val expected = 7
        val result = CountNumbersConsistentStrings().countConsistentStrings(allowed, words)

        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val allowed = "cad"
        val words = arrayOf("cc","acd","b","ba","bac","bad","ac","d")
        val expected = 4
        val result = CountNumbersConsistentStrings().countConsistentStrings(allowed, words)

        assertEquals(expected, result)
    }
}