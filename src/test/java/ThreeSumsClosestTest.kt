import org.junit.Assert.assertEquals
import org.junit.Test

class ThreeSumsClosestTest {
    @Test
    fun test1() {
        val input = intArrayOf(-1,2,1,-4)
        val target = 1
        val expected = 2
        val result = ThreeSumsClosest().threeSumClosest(input, target)
        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(0,0,0)
        val target = 1
        val expected = 0
        val result = ThreeSumsClosest().threeSumClosest(input, target)
        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val input = intArrayOf(1,3,4,7,8,9)
        val target = 15
        val expected = 15
        val result = ThreeSumsClosest().threeSumClosest(input, target)
        assertEquals(expected, result)
    }

    @Test
    fun test4() {
        val input = intArrayOf(2, 5, 6, 7)
        val target = 16
        val expected = 15
        val result = ThreeSumsClosest().threeSumClosest(input, target)
        assertEquals(expected, result)
    }
}