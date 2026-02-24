import ds.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class SwapNodesInPairsTest {
    @Test
    fun test1() {
        val input = ListNode(1)
        input.next = ListNode(2)
        input.next.next = ListNode(3)
        input.next.next.next = ListNode(4)

        val output = intArrayOf(2,1,4,3)
        val result = RemoveNthNodeFromEndOfListTest.toArray(SwapNodesInPairs().swapPairs(input))
        assertArrayEquals(output, result)
    }

    @Test
    fun test2() {
        val input = null
        val output = null
        val result = SwapNodesInPairs().swapPairs(input)
        assertEquals(output, result)
    }

    @Test
    fun test3() {
        val input = ListNode(1)
        val output = intArrayOf(1)
        val result = RemoveNthNodeFromEndOfListTest.toArray(SwapNodesInPairs().swapPairs(input))
        assertArrayEquals(output, result)
    }

    @Test
    fun test4() {
        val input = ListNode(1)
        input.next = ListNode(2)
        val output = intArrayOf(2, 1)
        val result = RemoveNthNodeFromEndOfListTest.toArray(SwapNodesInPairs().swapPairs(input))
        assertArrayEquals(output, result)
    }
}