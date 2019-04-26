import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> hs = new HashSet<>();

		for (int elem : nums1) {
			for (int j=0;j<nums2.length;j++) {
				if (elem == nums2[j]) {
					hs.add(elem);
				}
			}
		}

		return hs.stream().parallel().unordered().mapToInt(Number::intValue).toArray();
	}
}
