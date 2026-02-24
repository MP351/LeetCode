import org.junit.Assert.assertEquals
import org.junit.Test

class DividePlayersIntoTeamEqualSkillTest {
    @Test
    fun test1() {
        val input = intArrayOf(3,2,5,1,3,4)
        val output = 22L
        val result = DividePlayersIntoTeamEqualSkill().dividePlayers(input)
        assertEquals(output, result)
    }

    @Test
    fun test2() {
        val input = intArrayOf(1,1,2,3)
        val output = -1L
        val result = DividePlayersIntoTeamEqualSkill().dividePlayers(input)
        assertEquals(output, result)
    }

    @Test
    fun test3() {
        val input = intArrayOf(3,4)
        val output = 12L
        val result = DividePlayersIntoTeamEqualSkill().dividePlayers(input)
        assertEquals(output, result)
    }
}