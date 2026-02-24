import ds.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class DeleteNodesFromLinkedListPresentedInArrayTest {
    @Test
    fun test1() {
        val input = ListNode(1)
        input.next = ListNode(2)
        input.next.next = ListNode(3)
        val newHead = ListNode(4)
        input.next.next.next = newHead
        input.next.next.next.next = ListNode(5)
        input.next.next.next.next.next = ListNode(6)

        val nums = intArrayOf(1, 2, 3)

        assertEquals(newHead, DeleteNodesFromLinkedListPresentedInArray().modifiedList(nums, input))
    }

    @Test
    fun test2() {
        val input = ListNode(1)
        input.next = ListNode(2)
        input.next.next = ListNode(3)
        val newHead = ListNode(4)
        input.next.next.next = newHead
        input.next.next.next.next = ListNode(5)
        input.next.next.next.next.next = ListNode(6)

        val nums = intArrayOf(1, 2, 3)

        assertEquals(newHead, DeleteNodesFromLinkedListPresentedInArray().modifiedList(nums, input))
    }

    @Test
    fun test3() {
        val newHead = ListNode(2)

        val input = ListNode(1)
        input.next = newHead
        input.next.next = ListNode(1)
        input.next.next.next = ListNode(2)
        input.next.next.next.next = ListNode(1)
        input.next.next.next.next.next = ListNode(2)

        val nums = intArrayOf(1)

        assertEquals(newHead, DeleteNodesFromLinkedListPresentedInArray().modifiedList(nums, input))
    }

    @Test
    fun test4() {
        val input = ListNode(1)
        input.next = ListNode(2)
        input.next.next = ListNode(3)
        val newHead = ListNode(4)
        input.next.next.next = newHead
        input.next.next.next.next = ListNode(5)
        input.next.next.next.next.next = ListNode(6)

        val nums = intArrayOf(1, 2, 3)

        assertEquals(newHead, DeleteNodesFromLinkedListPresentedInArray().modifiedList(nums, input))
    }
}