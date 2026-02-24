import org.junit.Assert.assertEquals
import org.junit.Test

class DeleteCharactersFancyStringTest {
    @Test
    fun test1() {
        val input = "leeetcode"
        val expected = "leetcode"
        val result = DeleteCharactersFancyString().makeFancyString(input)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = "aaabaaaa"
        val expected = "aabaa"
        val result = DeleteCharactersFancyString().makeFancyString(input)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = "aaabaaaa"
        val expected = "aabaa"
        val result = DeleteCharactersFancyString().makeFancyString(input)
        assertEquals(expected, result)
    }
}