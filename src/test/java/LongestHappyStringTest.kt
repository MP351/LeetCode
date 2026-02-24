import org.junit.Test

class LongestHappyStringTest {
    @Test
    fun test1() {
        val result = LongestHappyString().longestDiverseString(1, 1, 7)
        println(result)
    }

    @Test
    fun test2() {
        val result = LongestHappyString().longestDiverseString(7, 1, 0)
        println(result)
    }

    @Test
    fun test3() {
        val result = LongestHappyString().longestDiverseString(2, 2, 1)
        println(result)
    }

    @Test
    fun test4() {
        val result = LongestHappyString().longestDiverseString(0, 9, 12)
        println(result)
    }
}