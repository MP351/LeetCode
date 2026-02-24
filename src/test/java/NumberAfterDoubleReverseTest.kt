import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class NumberAfterDoubleReverseTest {
    @Test
    fun test1() {
        val num = 526
        assertTrue(NumberAfterDoubleReverse().isSameAfterReversals(num))
    }

    @Test
    fun test2() {
        val num = 1800
        assertFalse(NumberAfterDoubleReverse().isSameAfterReversals(num))
    }

    @Test
    fun test3() {
        val num = 0
        assertTrue(NumberAfterDoubleReverse().isSameAfterReversals(num))
    }
}