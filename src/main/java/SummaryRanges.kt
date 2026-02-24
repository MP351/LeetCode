class SummaryRanges {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) {
            return emptyList()
        }
        var i = 0
        var begin = nums[0]
        val result = mutableListOf<String>()

        while (i < nums.size-1) {
            val num1 = nums[i]
            val num2 = nums[i+1]

            if (num1+1 != num2) {
                if (begin != num1) {
                    result.add("$begin->$num1")
                } else {
                    result.add("$begin")
                }
                begin = num2
            }
            i++
        }
        if (begin == nums[nums.size-1]) {
            result.add("$begin")
        } else {
            result.add("$begin->${nums[nums.size-1]}")
        }

        return result
    }
}