import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseBitsTest {
    @Test
    fun test1() {
        val input = "00000010100101000001111010011100".toInt(2)
        val output = "00111001011110000010100101000000".toInt(2)
        assertEquals(output, ReverseBits().reverseBits(input))
    }

//    @Test
//    fun test2() {
//        val input = "11111111111111111111111111111101".toInt(2)
//        val output = "10111111111111111111111111111111".toInt(2)
//        assertEquals(output, ReverseBits().reverseBits(input))
//    }
}