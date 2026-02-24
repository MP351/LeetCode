import ds.ListNode
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class InsertGreatestCommonDividerLinkedListTest {
    @Test
    fun test1() {
        val head = ListNode(18)
        head.next = ListNode(6)
        head.next.next = ListNode(10)
        head.next.next.next = ListNode(3)

        val expected = ListNode(18)
        expected.next = ListNode(6)
        expected.next.next = ListNode(6)
        expected.next.next.next = ListNode(2)
        expected.next.next.next.next = ListNode(10)
        expected.next.next.next.next.next = ListNode(1)
        expected.next.next.next.next.next.next = ListNode(3)

        val result = InsertGreatestCommonDividerLinkedList().insertGreatestCommonDivisors(head)
        RemoveNthNodeFromEndOfListTest.toArray(result).forEach {
            println(it)
        }

        assertArrayEquals(RemoveNthNodeFromEndOfListTest.toArray(expected), RemoveNthNodeFromEndOfListTest.toArray(result))
    }
}