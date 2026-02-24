import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ValidPalindrome2Test {
    @Test
    fun test1() {
        val input = "aba"
        assertTrue(ValidPalindrome2().validPalindrome(input))
    }

    @Test
    fun test2() {
        val input = "abca"
        assertTrue(ValidPalindrome2().validPalindrome(input))
    }

    @Test
    fun test3() {
        val input = "abc"
        assertFalse(ValidPalindrome2().validPalindrome(input))
    }

    @Test
    fun test4() {
        val input = "ebcbbececabbacecbbcbe"
        assertTrue(ValidPalindrome2().validPalindrome(input))
    }
//
//    @Test
//    fun test5() {
//        val input = "ab_a"
//        assertTrue(ValidPalindrome().isPalindrome(input))
//    }
//
//    @Test
//    fun test6() {
//        val input = "0P"
//        assertFalse(ValidPalindrome().isPalindrome(input))
//    }
}