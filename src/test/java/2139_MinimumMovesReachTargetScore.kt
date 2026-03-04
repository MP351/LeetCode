import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumMovesReachTargetScoreTest {
    private val useCase = MinimumMovesReachTargetScore()

    @Test
    fun test1() {
        assertEquals(4, useCase.minMoves(5, 0))
    }

    @Test
    fun test2() {
        assertEquals(7, useCase.minMoves(19, 2))
    }

    @Test
    fun test3() {
        assertEquals(4, useCase.minMoves(10, 4))
    }

    @Test
    fun test4() {
        assertEquals(0, useCase.minMoves(1, 4))
    }

    @Test
    fun test5() {
        assertEquals(9, useCase.minMoves(10, 0))
    }
}