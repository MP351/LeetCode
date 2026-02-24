import kotlin.math.min

class ShortestSubarrayWithOrLeastK2 {
    fun minimumSubarrayLength(nums: IntArray, k: Int): Int {
        return combWalk(nums, k)
    }

    private fun arrayWalk(nums: IntArray, k: Int): Int {
        var min = Int.MAX_VALUE

        for (i in nums.indices) {
            if (nums[i] >= k) {
                return 1
            }

            var downCounter = 1
            var downOr = nums[i]
            for (j in i-1 downTo 0) {
                downOr = downOr or nums[j]
                downCounter++

                if (downOr >= k) {
                    min = min(downCounter, min)
                }
            }

            var upCounter = 1
            var upOr = nums[i]
            for (j in i+1 until nums.size) {
                upOr = upOr or nums[j]
                upCounter++

                if (upOr >= k) {
                    min = min(upCounter, min)
                }
            }
        }

        return if (min == Int.MAX_VALUE) {
            -1
        } else {
            min
        }
    }

    private fun combWalk(nums: IntArray, k: Int): Int {
        var kk = k
        var biggestBit = 0

        while (kk > 0) {
            kk = kk.ushr(1)
            biggestBit++
        }

        var min = Int.MAX_VALUE

        for (i in nums.indices) {
            if (nums[i] >= k) {
                return 1
            }
            if (nums[i].ushr(biggestBit-2) == 0) {
                continue
            }

            var downCounter = 1
            var downOr = nums[i]
            for (j in i-1 downTo 0) {
                downOr = downOr or nums[j]
                downCounter++

                if (downOr >= k) {
                    min = min(downCounter, min)
                }
            }

            var upCounter = 1
            var upOr = nums[i]
            for (j in i+1 until nums.size) {
                upOr = upOr or nums[j]
                upCounter++

                if (upOr >= k) {
                    min = min(upCounter, min)
                }
            }
        }

        return if (min == Int.MAX_VALUE) {
            -1
        } else {
            min
        }
    }

    private fun bitWalk(nums: IntArray, k: Int): Int {
        var kk = k
        var biggestBit = 0

        while (kk > 0) {
            kk = kk.ushr(1)
            biggestBit++
        }

        for (i in nums.indices) {
            if (nums[i] == k) {
                return 1
            }
            if (nums[i].ushr(biggestBit) > 0) {
                return 1
            }

            if (nums[i].ushr(biggestBit-1) > 0) {
                for (j in i-1 downTo 0) {

                }
                for (j in i+1 until nums.size) {

                }
            }
        }
        return -1
    }
}