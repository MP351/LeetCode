import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class SortIntegersByTheNumberOfOneBitsTest {
    private val useCase = SortIntegersByTheNumberOfOneBits2()

//    @Test
//    fun testNumberOfBitsCalculator1() {
//        val num = 0b010101
//        val expected = 3
//
//        assertEquals(expected, useCase.getNumOfBits(num))
//    }
//
//    @Test
//    fun testNumberOfBitsCalculator2() {
//        val num = 0b00
//        val expected = 0
//
//        assertEquals(expected, useCase.getNumOfBits(num))
//    }

    @Test
    fun useCaseTest1() {
        val arr = intArrayOf(0,1,2,3,4,5,6,7,8)
        val expected = intArrayOf(0,1,2,4,8,3,5,6,7)

        assertArrayEquals(expected, useCase.sortByBits(arr))
    }

    @Test
    fun useCaseTest2() {
        val arr = intArrayOf(1024,512,256,128,64,32,16,8,4,2,1)
        val expected = intArrayOf(1,2,4,8,16,32,64,128,256,512,1024)

        assertArrayEquals(expected, useCase.sortByBits(arr))
    }

    @Test
    fun useCaseTest3() {
        val arr = intArrayOf()
        val expected = intArrayOf()

        assertArrayEquals(expected, useCase.sortByBits(arr))
    }

    @Test
    fun useCaseTest4() {
        val arr = intArrayOf(0,1,1,3,8,5,6,7,4)
        val expected = intArrayOf(0,1,1,4,8,3,5,6,7)

        assertArrayEquals(expected, useCase.sortByBits(arr))
    }
}