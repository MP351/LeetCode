class DividePlayersIntoTeamEqualSkill {
    fun dividePlayers(skill: IntArray): Long {
        skill.sort()

        var beginCounter = 0
        var endCounter = skill.size - 1
        val firstTeamSkill = skill[0] + skill[skill.size - 1]
        var sum = 0L

        while (beginCounter < endCounter) {
            val currentTeamSkill = skill[beginCounter] + skill[endCounter]
            if (firstTeamSkill != currentTeamSkill) {
                return -1
            }

            sum += skill[beginCounter++] * skill[endCounter--]
        }

        return sum
    }
}