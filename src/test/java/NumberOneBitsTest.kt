import org.junit.Assert.assertEquals
import org.junit.Test

class NumberOneBitsTest {
    @Test
    fun test1() {
        val input = 11
        val output = 3
        assertEquals(output, NumberOneBits().hammingWeight(input))
    }
}