import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] array = new int[Integer.max(nums1.length, nums2.length)];

		int k = 0;
		for (int elem : nums1) {
			for (int j=0;j<nums2.length;j++) {
				if (elem == nums2[j]) {
					array[k++] = elem;
					nums2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}

		return Arrays.copyOf(array, k);
	}
}
