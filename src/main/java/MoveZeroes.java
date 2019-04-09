/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                int tmp = nums[len];
                nums[len] = nums[i];
                nums[i] = tmp;
                len++;
            }
        }
    }
}
