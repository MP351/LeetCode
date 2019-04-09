/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 *
 *     The number of elements initialized in nums1 and nums2 are m and n respectively.
 *     You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 *
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i=0;i<m && j < n;i++) {
            if (nums1[i] > nums2[j]) {
                int tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;

                sortArr(nums2);
            }
        }

        j = 0;
        for (int i=m;i<m+n;i++) {
            nums1[i] = nums2[j++];
        }
    }

    private static void sortArr(int[] arr) {
        for (int i = 1;i<arr.length;i++) {
            if (arr[i-1] > arr[i]) {
                int tmp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = tmp;
            } else {
                break;
            }
        }
    }
}
