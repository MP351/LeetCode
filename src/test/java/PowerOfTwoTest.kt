import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PowerOfTwoTest {
    @Test
    fun test1() {
        assertTrue(PowerOfTwo().isPowerOfTwo(2))
    }

    @Test
    fun test2() {
        assertTrue(PowerOfTwo().isPowerOfTwo(536870912))
    }

    @Test
    fun test3() {
        assertTrue(PowerOfTwo().isPowerOfTwo(4))
    }

    @Test
    fun test4() {
        assertTrue(PowerOfTwo().isPowerOfTwo(128))
    }

    @Test
    fun test5() {
        assertFalse(PowerOfTwo().isPowerOfTwo(262145))
    }

    @Test
    fun test6() {
        assertFalse(PowerOfTwo().isPowerOfTwo(16777217))
    }

    @Test
    fun test7() {
        assertFalse(PowerOfTwo().isPowerOfTwo(2049))
    }

    @Test
    fun test8() {
        assertFalse(PowerOfTwo().isPowerOfTwo(17))
    }
}