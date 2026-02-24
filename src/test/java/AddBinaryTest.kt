import org.junit.Assert.assertEquals
import org.junit.Test

class AddBinaryTest {
    @Test
    fun test1() {
        val a = "1010"
        val b = "1011"
        val correctAnswer = "10101"
        assertEquals(correctAnswer, AddBinary().addBinary(a, b))
    }

    @Test
    fun test2() {
        val a = "11"
        val b = "1"
        val correctAnswer = "100"
        assertEquals(correctAnswer, AddBinary().addBinary(a, b))
    }

    @Test
    fun test3() {
        val a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
        val b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        val correctAnswer = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
        assertEquals(correctAnswer, AddBinary().addBinary(a, b))
    }
}