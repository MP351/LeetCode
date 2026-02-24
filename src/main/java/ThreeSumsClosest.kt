import kotlin.math.abs

class ThreeSumsClosest {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        return lessBrute(nums, target)
    }

    private fun lessBrute(nums: IntArray, target: Int): Int {
        nums.sort()
        var closest = nums[0] + nums[1] + nums[2]

        for (i in 0 until nums.size-2) {
            var j = i+1
            var k = nums.size-1

            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]

                if (abs(sum - target) < abs(closest - target)) {
                    closest = sum
                }
                if (sum < target) {
                    j++
                } else {
                    k--
                }
            }
        }

        return closest
    }

    private fun brute(nums: IntArray, target: Int): Int {
        var sum = Int.MAX_VALUE

        for (i in 0 until nums.size-2) {
            for (j in i+1 until nums.size-1) {
                for (k in j+1 until nums.size) {
                    val tmp = nums[i] + nums[j] + nums[k]
                    val diff = tmp - target
                    if (abs(diff) < abs(sum - target)) {
                        sum = tmp
                    }
                }
            }
        }

        return sum
    }
}