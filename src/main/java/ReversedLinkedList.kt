import ds.ListNode

class ReversedLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        return reverseRecursively(head, null)
    }

    private fun reverseRecursively(head: ListNode?, prev: ListNode?): ListNode? {
        if (head == null)
            return prev

        val tmp = head.next
        head.next = prev
        return reverseRecursively(tmp, head)
    }

    private fun reverse(head: ListNode?): ListNode? {
        var node = head
        var prev: ListNode? = null

        while (node != null) {
            val tmp = node.next
            node.next = prev
            prev = node

            node = tmp
        }
        return prev
    }
}