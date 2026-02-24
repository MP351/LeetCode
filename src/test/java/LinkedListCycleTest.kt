import ds.ListNode
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LinkedListCycleTest {
    @Test
    fun test1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next.next = ListNode(3)
        head.next.next.next = ListNode(4)
        head.next.next.next.next = ListNode(5)
        head.next.next.next.next.next = ListNode(6)
        head.next.next.next.next.next.next = head

        assertTrue(LinkedListCycle().hasCycle(head))
    }

    @Test
    fun test2() {
        val head = ListNode(1)

        assertFalse(LinkedListCycle().hasCycle(head))
    }
}