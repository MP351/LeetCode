import ds.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class DeleteNodeInLinkedListTest {
    @Test
    fun test1() {
        val head = ListNode(4)
        val node = ListNode(5)
        head.next = node
        head.next.next = ListNode(1)
        head.next.next.next = ListNode(9)

        DeleteNodeInLinkedList().deleteNode(node)
        RemoveNthNodeFromEndOfListTest.toArray(head).forEach {
            println(it)
        }
        assertArrayEquals(intArrayOf(4, 1, 9), RemoveNthNodeFromEndOfListTest.toArray(head))
    }

    @Test
    fun test2() {
        val head = ListNode(4)
        val node = ListNode(1)
        head.next = ListNode(5)
        head.next.next = node
        head.next.next.next = ListNode(9)

        DeleteNodeInLinkedList().deleteNode(node)
        RemoveNthNodeFromEndOfListTest.toArray(head).forEach {
            println(it)
        }
        assertArrayEquals(intArrayOf(4, 5, 9), RemoveNthNodeFromEndOfListTest.toArray(head))
    }
}