import org.junit.Assert.assertEquals
import org.junit.Test

class SqrtTest {
    @Test
    fun test1() {
        val x = 4
        val expected = 2
        val result = Sqrt().mySqrt(x)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val x = 8
        val expected = 2
        val result = Sqrt().mySqrt(x)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val x = 2147483646
        val expected = 46340
        val result = Sqrt().mySqrt(x)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val x = 0
        val expected = 0
        val result = Sqrt().mySqrt(x)
        assertEquals(expected, result)
    }

    @Test
    fun test5() {
        val x = 2
        val expected = 1
        val result = Sqrt().mySqrt(x)
        assertEquals(expected, result)
    }

}