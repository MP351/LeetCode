import org.junit.Assert.assertEquals
import org.junit.Test

class ClimbingStairsTest {
    @Test
    fun test1() {
        val n = 1
        val expected = 1
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 2
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }

    @Test
    fun test3() {
        val n = 3
        val expected = 3
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }

    @Test
    fun test4() {
        val n = 4
        val expected = 5
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }

    @Test
    fun test5() {
        val n = 5
        val expected = 8
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }

    @Test
    fun test6() {
        val n = 6
        val expected = 13
        assertEquals(expected, ClimbingStairs().climbStairs(n))
    }
}