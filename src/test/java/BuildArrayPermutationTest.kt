import org.junit.Assert.assertArrayEquals
import org.junit.Test

class BuildArrayPermutationTest {
    @Test
    fun test1() {
        val input = intArrayOf(0,2,1,5,3,4)
        val expected = intArrayOf(0,1,2,4,5,3)
        val result = BuildArrayPermutation().buildArray(input)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(5,0,1,2,3,4)
        val expected = intArrayOf(4,5,0,1,2,3)
        val result = BuildArrayPermutation().buildArray(input)
        assertArrayEquals(expected, result)
    }
}