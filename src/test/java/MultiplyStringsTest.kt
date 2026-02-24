import org.junit.Assert.assertEquals
import org.junit.Test

class MultiplyStringsTest {
    @Test
    fun test1() {
        val num1 = "2"
        val num2 = "3"
        val expected = "6"
        val result = MultiplyStrings().multiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val num1 = "123"
        val num2 = "456"
        val expected = "56088"
        val result = MultiplyStrings().multiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val num1 = "111111111111111"
        val num2 = "11111111111111"
        val expected = "1234567901234554320987654321"
        val result = MultiplyStrings().multiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val num1 = "9133"
        val num2 = "0"
        val expected = "0"
        val result = MultiplyStrings().multiply(num1, num2)
        assertEquals(expected, result)
    }


    @Test
    fun multiplyTest1() {
        val num1 = "100"
        val num2 = '4'
        val expected = "400"
        val result = MultiplyStrings().simpleMultiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun multiplyTest2() {
        val num1 = "55"
        val num2 = '4'
        val expected = "220"
        val result = MultiplyStrings().simpleMultiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun multiplyTest3() {
        val num1 = "4"
        val num2 = '4'
        val expected = "16"
        val result = MultiplyStrings().simpleMultiply(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun addTest1() {
        val num1 = "4"
        val num2 = "4"
        val expected = "8"
        val result = MultiplyStrings().add(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun addTest2() {
        val num1 = "40"
        val num2 = "4"
        val expected = "44"
        val result = MultiplyStrings().add(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun addTest3() {
        val num1 = "1230"
        val num2 = "1230"
        val expected = "2460"
        val result = MultiplyStrings().add(num1, num2)
        assertEquals(expected, result)
    }

    @Test
    fun addTest4() {
        val num1 = "0"
        val num2 = "1230"
        val expected = "1230"
        val result = MultiplyStrings().add(num1, num2)
        assertEquals(expected, result)
    }
}