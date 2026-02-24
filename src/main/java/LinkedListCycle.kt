import ds.ListNode

class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (slow != null && fast != null) {
            slow = slow.next
            fast = fast.next?.next

            if (slow == fast && slow != null) {
                return true
            }
        }

        return false
    }

    private fun byModify(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }
        if (head.`val` == Int.MIN_VALUE) {
            return true
        }

        head.`val` = Int.MIN_VALUE

        return byModify(head.next)
    }
}