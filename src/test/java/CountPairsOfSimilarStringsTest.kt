import org.junit.Assert.assertEquals
import org.junit.Test

class CountPairsOfSimilarStringsTest {
    @Test
    fun test1() {
        val input = arrayOf("aba","aabb","abcd","bac","aabc")
        val expected = 2
        val result = CountPairsOfSimilarStrings().similarPairs(input)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = arrayOf("aabb","ab","ba")
        val expected = 3
        val result = CountPairsOfSimilarStrings().similarPairs(input)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = arrayOf("afbz","ab","ba")
        val expected = 3
        val result = CountPairsOfSimilarStrings().similarPairs(input)
        assertEquals(expected, result)
    }
}