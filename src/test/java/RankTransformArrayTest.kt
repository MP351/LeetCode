import org.junit.Assert.assertArrayEquals
import org.junit.Test

class RankTransformArrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(40,10,20,30)
        val expected = intArrayOf(4,1,2,3)
        val result = RankTransformArray().arrayRankTransform(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(100, 100, 100)
        val expected = intArrayOf(1,1,1)
        val result = RankTransformArray().arrayRankTransform(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = intArrayOf(37,12,28,9,100,56,80,5,12)
        val expected = intArrayOf(5,3,4,2,8,6,7,1,3)
        val result = RankTransformArray().arrayRankTransform(input)
        assertArrayEquals(expected, result)
    }
}