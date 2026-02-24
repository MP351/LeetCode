import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class XORQueriesSubArrayTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1,3,4,8)
        val queries = arrayOf(
            intArrayOf(0,1),
            intArrayOf(1,2),
            intArrayOf(0,3),
            intArrayOf(3,3)
        )
        val expected = intArrayOf(2,7,14,8)
        val result = XORQueriesSubArray().xorQueries(arr, queries)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val arr = intArrayOf(16)
        val queries = arrayOf(
            intArrayOf(0,0),
            intArrayOf(0,0),
            intArrayOf(0,0),
//            intArrayOf(3,3)
        )
        val expected = intArrayOf(16, 16, 16)
        val result = XORQueriesSubArray().xorQueries(arr, queries)
        assertArrayEquals(expected, result)
    }
}