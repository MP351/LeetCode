import org.junit.Assert.assertEquals
import org.junit.Test

class SumOfDigitsOfStringAfterConvertTest  {
    @Test
    fun test1() {
        val converter = SumOfDigitsOfStringAfterConvert()
        val input1 = "iiii"
        val input2 = 1
        val expected = 36
        assertEquals(expected, converter.getLucky(input1, input2))
    }

    @Test
    fun test2() {
        val converter = SumOfDigitsOfStringAfterConvert()
        val input1 = "leetcode"
        val input2 = 2
        val expected = 6
        assertEquals(expected, converter.getLucky(input1, input2))
    }

    @Test
    fun test3() {
        val converter = SumOfDigitsOfStringAfterConvert()
        val input1 = "zbax"
        val input2 = 2
        val expected = 8
        assertEquals(expected, converter.getLucky(input1, input2))
    }

    @Test
    fun test4() {
        val converter = SumOfDigitsOfStringAfterConvert()
        val input1 = "z"
        val input2 = 1
        val expected = 2+6
        assertEquals(expected, converter.getLucky(input1, input2))
    }
}