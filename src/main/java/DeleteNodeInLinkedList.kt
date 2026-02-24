import ds.ListNode

class DeleteNodeInLinkedList {
    fun deleteNode(node: ListNode?) {
        if (node == null) {
            return
        }

        var currentNode = node
        while (currentNode?.next?.next != null) {
            currentNode.`val` = currentNode.next.`val`
            currentNode = currentNode.next
        }

        currentNode?.`val` = currentNode?.next?.`val`!!
        currentNode?.next = null
    }


}