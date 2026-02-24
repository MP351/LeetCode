class ConcatenationArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)

//        for (i in nums.indices) {
//            result[i] = nums[i]
//            result[i+nums.size] = nums[i]
//        }
//        nums.forEachIndexed { i, value ->
//            result[i] = value
//            result[i+nums.size] = value
//        }
//        result
        return nums + nums
    }
}