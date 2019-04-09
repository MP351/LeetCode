/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * https://leetcode.com/problems/two-sum/
 */

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i=0;i<nums.length;i++) {
            for (int j=nums.length-1;j>i;j--) {
                if  (target == nums[i]+nums[j]) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }
}