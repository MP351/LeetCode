package ds

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ListNodeTest {
    @Test
    fun testEquals1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)

        val head2 = ListNode(1)
        head2.next = ListNode(2)
        head2.next.next = ListNode(3)
        head2.next.next.next = ListNode(4)
        head2.next.next.next.next = ListNode(5)

        assertTrue(head.equals(head2))
    }

    @Test
    fun testEquals2() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)

        val head2 = ListNode(1)
        head2.next = ListNode(2)
        head2.next.next = ListNode(3)
        head2.next.next.next = ListNode(4)
        head2.next.next.next.next = ListNode(5)

        assertFalse(head.equals(head2))
    }

    @Test
    fun testEquals3() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)

        val head2 = null

        assertFalse(head.equals(head2))
    }

    @Test
    fun testToArray1() {
        val list = listOf(1, 2, 3, 4, 5)
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)


        assertTrue(head.equals(ListNode.fromList(list)))
    }

    @Test
    fun testToArray2() {
        val list = listOf(1, 2, 3, 4)
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)


        assertFalse(head.equals(ListNode.fromList(list)))
    }

    @Test
    fun testToArray3() {
        val list = null
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)


        assertFalse(head.equals(ListNode.fromList(list)))
    }
}