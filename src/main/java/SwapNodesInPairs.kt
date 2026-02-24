import ds.ListNode

class SwapNodesInPairs {
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        if (head.next == null) {
            return head
        }

        var current = head
        val newHead = current.next
        var prev: ListNode? = null
        while (current?.next != null) {
            val nextNext = current.next.next
            current.next.next = current
            prev?.next = current.next
            current.next = nextNext


            prev = current
            current = nextNext
        }

        return newHead
    }
}