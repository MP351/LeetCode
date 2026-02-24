import ds.ListNode
import org.junit.Assert.assertEquals
import org.junit.Test

class IntersectionTwoLinkedListsTest {
    @Test
    fun test1() {
        val headA = ListNode(4)
        headA.next = ListNode(1)
        val intersection = ListNode(8)
        intersection.next = ListNode(4)
        intersection.next.next = ListNode(5)
        headA.next.next = intersection
        val headB = ListNode(5)
        headB.next = ListNode(6)
        headB.next.next = ListNode(1)
        headB.next.next.next = intersection

        assertEquals(intersection, IntersectionTwoLinkedLists().getIntersectionNode(headA, headB))
    }

    @Test
    fun test2() {
        val intersection = ListNode(2)
        intersection.next = ListNode(4)

        val headA = ListNode(1)
        headA.next = ListNode(9)
        headA.next.next = ListNode(1)
        headA.next.next.next = intersection
        val headB = ListNode(3)
        headB.next = intersection

        assertEquals(intersection, IntersectionTwoLinkedLists().getIntersectionNode(headA, headB))
    }

    @Test
    fun test3() {

        val headA = ListNode(2)
        headA.next = ListNode(6)
        headA.next.next = ListNode(4)
        val headB = ListNode(1)
        headB.next = ListNode((5))

        assertEquals(null, IntersectionTwoLinkedLists().getIntersectionNode(headA, headB))
    }
}