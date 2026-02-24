import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ValidPalindromeTest {
    @Test
    fun test1() {
        val input = "A man, a plan, a canal: Panama"
        assertTrue(ValidPalindrome().isPalindrome(input))
    }

    @Test
    fun test2() {
        val input = "race a car"
        assertFalse(ValidPalindrome().isPalindrome(input))
    }

    @Test
    fun test3() {
        val input = ""
        assertTrue(ValidPalindrome().isPalindrome(input))
    }

    @Test
    fun test4() {
        val input = "aa"
        assertTrue(ValidPalindrome().isPalindrome(input))
    }

    @Test
    fun test5() {
        val input = "ab_a"
        assertTrue(ValidPalindrome().isPalindrome(input))
    }

    @Test
    fun test6() {
        val input = "0P"
        assertFalse(ValidPalindrome().isPalindrome(input))
    }
}