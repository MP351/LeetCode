import ds.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SpiralMatrix4Test {
    @Test
    fun test1() {
        val m = 3
        val n = 5
        val head = ListNode(3)
        head.next = ListNode(0)
        head.next.next = ListNode(2)
        head.next.next.next = ListNode(6)
        head.next.next.next.next = ListNode(8)
        head.next.next.next.next.next = ListNode(1)
        head.next.next.next.next.next.next = ListNode(7)
        head.next.next.next.next.next.next.next = ListNode(9)
        head.next.next.next.next.next.next.next.next = ListNode(4)
        head.next.next.next.next.next.next.next.next.next = ListNode(2)
        head.next.next.next.next.next.next.next.next.next.next = ListNode(5)
        head.next.next.next.next.next.next.next.next.next.next.next = ListNode(5)
        head.next.next.next.next.next.next.next.next.next.next.next.next = ListNode(0)
        val result = arrayOf(
            intArrayOf(3, 0, 2, 6, 8),
            intArrayOf(5, 0, -1, -1, 1),
            intArrayOf(5, 2, 4, 9, 7)
        )

        assertArrayEquals(result, SpiralMatrix4().spiralMatrix(m, n, head))
    }

    @Test
    fun test2() {
        val m = 3
        val n = 5
        val head = ListNode(3)
        head.next = ListNode(0)
        head.next.next = ListNode(2)
        head.next.next.next = ListNode(6)
        head.next.next.next.next = ListNode(8)
        head.next.next.next.next.next = ListNode(1)
        head.next.next.next.next.next.next = ListNode(7)
        head.next.next.next.next.next.next.next = ListNode(9)
        head.next.next.next.next.next.next.next.next = ListNode(4)
        head.next.next.next.next.next.next.next.next.next = ListNode(2)
        head.next.next.next.next.next.next.next.next.next.next = ListNode(5)
        head.next.next.next.next.next.next.next.next.next.next.next = ListNode(5)
        head.next.next.next.next.next.next.next.next.next.next.next.next = ListNode(0)
        head.next.next.next.next.next.next.next.next.next.next.next.next.next = ListNode(6)
        val result = arrayOf(
            intArrayOf(3, 0, 2, 6, 8),
            intArrayOf(5, 0, 6, -1, 1),
            intArrayOf(5, 2, 4, 9, 7)
        )

        assertArrayEquals(result, SpiralMatrix4().spiralMatrix(m, n, head))
    }

    @Test
    fun test3() {
        val m = 1
        val n = 4
        val head = ListNode(3)
        head.next = ListNode(0)
        head.next.next = ListNode(2)
        val result = arrayOf(
            intArrayOf(3, 0, 2, -1),
        )

        assertArrayEquals(result, SpiralMatrix4().spiralMatrix(m, n, head))
    }
}