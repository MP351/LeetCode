import ds.ListNode
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PalindromeLinkedListTest {
    @Test
    fun test1() {
        val input = ListNode.fromList(listOf(1, 2, 2, 1))
        assertTrue(PalindromeLinkedList().isPalindrome(input))
    }

    @Test
    fun test2() {
        val input = ListNode.fromList(listOf(1, 2))
        assertFalse(PalindromeLinkedList().isPalindrome(input))
    }
}