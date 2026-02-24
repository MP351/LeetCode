import ds.ListNode

class IntersectionTwoLinkedLists {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        return byChasing(headA, headB)
    }

    private fun byChasing(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) {
            return null
        }

        var a = headA
        var b = headB

        while (a != b) {
            a = if (a == null) headB else a.next
            b = if (b == null) headA else b.next
        }

        return a
    }

    private fun byModify(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null && headB == null) {
            return null
        }
        if (headA?.`val` == -1) {
            return headA
        }
        headA?.`val` = -1
        if (headB?.`val` == -1) {
            return headB
        }
        headB?.`val` = -1
        return byModify(headA?.next, headB?.next)
    }
}