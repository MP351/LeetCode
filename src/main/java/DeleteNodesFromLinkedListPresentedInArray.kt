import ds.ListNode
import java.util.*

class DeleteNodesFromLinkedListPresentedInArray {
    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        val set = HashSet<Int>(nums.size)
        set.addAll(nums.asIterable())

        var headNew = head
        var currentNode = head
        var lastNotPresentedNode: ListNode? = null

        while (currentNode != null) {
            if (set.contains(currentNode.`val`)) {
                if (lastNotPresentedNode != null) {
                    lastNotPresentedNode.next = currentNode.next
                } else {
                    headNew = currentNode.next
                }
            } else {
                lastNotPresentedNode = currentNode
            }

            currentNode = currentNode.next
        }
        return headNew
    }
}