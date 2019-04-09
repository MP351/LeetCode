/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i=1;i<nums.length;i++) {
            if (nums[len] != nums[i]) {
                nums[++len] = nums[i];
            }
        }
        return len+1;
    }
}
