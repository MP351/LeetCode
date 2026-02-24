import ds.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class ReversedLinkedListTest {
    @Test
    fun test1() {
        val head = ListNode(0)
        head.next = ListNode(1)
        head.next.next = ListNode(2)
        head.next.next.next = ListNode(3)
        head.next.next.next.next = ListNode(4)
        head.next.next.next.next.next = ListNode(5)

        val expected = ListNode(5)
        expected.next = ListNode(4)
        expected.next.next = ListNode(3)
        expected.next.next.next = ListNode(2)
        expected.next.next.next.next = ListNode(1)
        expected.next.next.next.next.next = ListNode(0)
        assertArrayEquals(RemoveNthNodeFromEndOfListTest.toArray(expected), RemoveNthNodeFromEndOfListTest.toArray(ReversedLinkedList().reverseList(head)))
    }

    @Test
    fun test2() {
        val head = ListNode(1)
        head.next = ListNode(2)

        val expected = ListNode(2)
        expected.next = ListNode(1)
        assertArrayEquals(RemoveNthNodeFromEndOfListTest.toArray(expected), RemoveNthNodeFromEndOfListTest.toArray(ReversedLinkedList().reverseList(head)))
    }

    @Test
    fun test3() {
        val head = null

        val expected = null
        assertArrayEquals(RemoveNthNodeFromEndOfListTest.toArray(expected), RemoveNthNodeFromEndOfListTest.toArray(ReversedLinkedList().reverseList(head)))
    }
}