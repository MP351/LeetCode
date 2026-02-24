import ds.ListNode

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        return brute(head)
    }

    private fun brute(head: ListNode?): Boolean {
        val list = mutableListOf<Int>()
        var node = head
        while (node != null) {
            list.add(node.`val`)

            node = node.next
        }

        var f = 0
        var b = list.size-1

        while (f < b) {
            if (list[f++] != list[b--]) {
                return false
            }
        }

        return true
    }
}