import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PowerOfThreeTest {
    @Test
    fun test1() {
        assertTrue(PowerOfThree().isPowerOfThree(3))
    }

    @Test
    fun test2() {
        assertTrue(PowerOfThree().isPowerOfThree(9))
    }

    @Test
    fun test3() {
        assertTrue(PowerOfThree().isPowerOfThree(27))
    }

    @Test
    fun test4() {
        assertFalse(PowerOfThree().isPowerOfThree(2069870691))
    }

    @Test
    fun test5() {
        assertTrue(PowerOfThree().isPowerOfThree(2147483647))
    }
}