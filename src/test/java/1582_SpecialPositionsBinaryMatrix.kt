import org.junit.Test
import org.junit.Assert.assertEquals

class SpecialPositionsBinaryMatrixTest {
    private val useCase = SpecialPositionsBinaryMatrix()

    @Test
    fun test1() {
        val mat = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0 ,0))
        val expected = 1
        assertEquals(expected, useCase.numSpecial(mat))
    }

    @Test
    fun test2() {
        val mat = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0 ,1))
        val expected = 3
        assertEquals(expected, useCase.numSpecial(mat))
    }

    @Test
    fun test3() {
        val mat = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0 ,0))
        val expected = 0
        assertEquals(expected, useCase.numSpecial(mat))
    }
}