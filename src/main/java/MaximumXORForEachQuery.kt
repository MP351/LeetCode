import kotlin.math.pow

class MaximumXORForEachQuery {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val e = (2.0.pow(maximumBit) - 1).toInt()
//        val xorNums = IntArray(nums.size) {
//            nums[it]
//        }

        for (i in 1 until nums.size) {
            nums[i] = nums[i-1] xor nums[i]
        }

        val result = IntArray(nums.size)
        var counter = 0
        for (i in nums.size-1 downTo  0) {
            result[counter++] = nums[i] xor e
        }

        return result
    }
}