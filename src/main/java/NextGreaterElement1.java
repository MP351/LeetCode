/**
 *  You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 *  Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 *
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 *
 * https://leetcode.com/problems/next-greater-element-i/
 *
 * No, it's asking you to take an element in the first array and then find the same element in the second array and then
 * look to the right in the second array to find a greater one. I couldn`t understand this until
 * I looked into some solutions in the discussion, either. And the examples provided by this question are not explanatory at all.
 */
public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];

        for (int i=0;i<nums1.length;i++) {
            array[i] = getBiggerRighter(nums2, nums1[i]);
        }
        return array;
    }

    public int getBiggerRighter(int[] array, int number) {
        boolean fl = false;

        for (int elem : array) {
            if (number == elem) {
                fl = true;
            } else if (fl && elem > number) {
                return elem;
            }
        }
        return -1;
    }
}
