import org.junit.Assert.assertEquals
import org.junit.Test

class ShortestSubarrayWithOrLeastK2Test {
    @Test
    fun test1() {
        val input = intArrayOf(1,2,3)
        val k = 2
        val expected = 1
        val result = ShortestSubarrayWithOrLeastK2().minimumSubarrayLength(input, k)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(2,1,8)
        val k = 10
        val expected = 3
        val result = ShortestSubarrayWithOrLeastK2().minimumSubarrayLength(input, k)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = intArrayOf(1,2)
        val k = 0
        val expected = 1
        val result = ShortestSubarrayWithOrLeastK2().minimumSubarrayLength(input, k)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val input = intArrayOf(1,2,32,21)
        val k = 55
        val expected = 3
        val result = ShortestSubarrayWithOrLeastK2().minimumSubarrayLength(input, k)
        assertEquals(expected, result)
    }

    @Test
    fun test5() {
        val input = intArrayOf(2,1,6,32,86,56)
        val k = 123
        val expected = 2
        val result = ShortestSubarrayWithOrLeastK2().minimumSubarrayLength(input, k)
        assertEquals(expected, result)
    }

}