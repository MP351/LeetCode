import ds.ListNode

class RemoveLinkedListElements {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) {
            return null
        }

        var newHead = head
        var currentNode = head
        var lastNotPresentedNode: ListNode? = null

        while (currentNode != null) {
            if (currentNode.`val` == `val`) {
                if (lastNotPresentedNode != null) {
                    lastNotPresentedNode.next = currentNode.next
                } else {
                    newHead = currentNode.next
                }
            } else {
                lastNotPresentedNode = currentNode
            }

            currentNode = currentNode.next
        }
        return newHead
    }
}