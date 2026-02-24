import ds.ListNode

class InsertGreatestCommonDividerLinkedList {
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var node1 = head
        var node2 = head?.next

        while (node2 != null) {
            val newNode = ListNode(getDivider(node1?.`val` ?: 1, node2.`val`))
            newNode.next = node2
            node1?.next = newNode

            node1 = node2
            node2 = node2.next
        }

        return head
    }

    private fun getDivider(num1: Int, num2: Int): Int {
        var a: Int
        var b: Int
        if (num1 < num2) {
            a = num2
            b = num1
        } else {
            a = num1
            b = num2
        }

        while (b != 0) {
            val tmp = b
            b = a % b
            a = tmp
        }
        return a
    }
}