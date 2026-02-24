import org.junit.Assert.assertArrayEquals
import org.junit.Test

class AddToArrayFormIntegerTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = intArrayOf(1, 2, 3, 4)
        val result = AddToArrayFormInteger().addToArrayForm(input, k)
        assertArrayEquals(expected, result.toIntArray())
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 7, 4)
        val k = 181
        val expected = intArrayOf(4, 5, 5)
        val result = AddToArrayFormInteger().addToArrayForm(input, k)
        assertArrayEquals(expected, result.toIntArray())
    }

    @Test
    fun test3() {
        val input = intArrayOf(2, 1, 5)
        val k = 806
        val expected = intArrayOf(1, 0, 2, 1)
        val result = AddToArrayFormInteger().addToArrayForm(input, k)
        assertArrayEquals(expected, result.toIntArray())
    }

    @Test
    fun test4() {
        val input = intArrayOf(0)
        val k = 23
        val expected = intArrayOf(2, 3)
        val result = AddToArrayFormInteger().addToArrayForm(input, k)
        assertArrayEquals(expected, result.toIntArray())
    }

    @Test
    fun test5() {
        val input = intArrayOf(9, 9)
        val k = 1
        val expected = intArrayOf(1, 0, 0)
        val result = AddToArrayFormInteger().addToArrayForm(input, k)
        assertArrayEquals(expected, result.toIntArray())
    }
}