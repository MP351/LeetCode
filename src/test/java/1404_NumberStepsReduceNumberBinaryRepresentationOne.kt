import org.junit.Assert.assertEquals
import org.junit.Test

class NumberStepsReduceNumberBinaryRepresentationOneTest {
    val useCase = NumberStepsReduceNumberBinaryRepresentationOne()

    @Test
    fun test1() {
        val input = "1101"
        val expected = 6

        assertEquals(expected, useCase.numSteps(input))
    }


    @Test
    fun test2() {
        val input = "10"
        val expected = 1

        assertEquals(expected, useCase.numSteps(input))
    }

    @Test
    fun test3() {
        val input = "1"
        val expected = 0

        assertEquals(expected, useCase.numSteps(input))
    }

    @Test
    fun test4() {
        val input = "111"
        val expected = 4

        assertEquals(expected, useCase.numSteps(input))
    }

    @Test
    fun test5() {
        val input = "10111111000010101101011100001011110110100001010101000000101001101101101000111011000100101110110001101100110011101011101110100110011110110000001001001001011010100100011011101"
        val expected = 259

        assertEquals(expected, useCase.numSteps(input))
    }
}