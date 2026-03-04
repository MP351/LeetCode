import org.junit.Assert.assertEquals
import org.junit.Test

class FindKthBitNthBinaryStringTest {
    private val useCase = FindKthBitNthBinaryString()

    @Test
    fun test1() {
        assertEquals('0', useCase.findKthBit(3,1))
    }

    @Test
    fun test2() {
        assertEquals('1', useCase.findKthBit(4,11))
    }

    @Test
    fun test3() {
        assertEquals('0', useCase.findKthBit(3,5))
    }
}