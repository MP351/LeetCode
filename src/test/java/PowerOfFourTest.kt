import org.junit.Assert.assertTrue
import org.junit.Test

class PowerOfFourTest {
    @Test
    fun test1() {
        assertTrue(PowerOfFour().isPowerOfFour(4))
    }

    @Test
    fun test2() {
        assertTrue(PowerOfFour().isPowerOfFour(16))
    }

    @Test
    fun test3() {
        assertTrue(PowerOfFour().isPowerOfFour(64))
    }

    @Test
    fun test4() {
        assertTrue(PowerOfFour().isPowerOfFour(256))
    }

    @Test
    fun test5() {
        assertTrue(PowerOfFour().isPowerOfFour(64))
    }
}