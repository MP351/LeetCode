class BuildArrayPermutation {
    /**
     * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where
     * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
     *
     * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
     */
    fun buildArray(nums: IntArray): IntArray {
        return extraArray(nums)
    }

    private fun extraArray(nums: IntArray): IntArray {
        val array = IntArray(nums.size)

        for (i in nums.indices) {
            array[i] = nums[nums[i]]
        }
        return array
    }
}