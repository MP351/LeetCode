import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SummaryRangesTest {
    @Test
    fun test1() {
        val input = intArrayOf(0,1,2,4,5,7)
        val expected = listOf("0->2","4->5","7")
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test2() {
        val input = intArrayOf(0,1,2,4,5,7, 9)
        val expected = listOf("0->2","4->5","7", "9")
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test3() {
        val input = intArrayOf(0,1,2,4,5,7, 8)
        val expected = listOf("0->2","4->5","7->8")
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test4() {
        val input = intArrayOf(0,2,3,4,6,8,9)
        val expected = listOf("0","2->4","6","8->9")
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test5() {
        val input = intArrayOf()
        val expected = listOf<String>()
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test6() {
        val input = intArrayOf(1)
        val expected = listOf<String>("1")
        val result = SummaryRanges().summaryRanges(input)
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }
}