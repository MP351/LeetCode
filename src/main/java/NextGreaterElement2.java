import java.util.Stack;

/**
 * Given a circular array (the next element of the last element is the first element of the array),
 * print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number
 * to its traversing-order next in the array, which means you could search circularly to find its next greater number.
 * If it doesn't exist, output -1 for this number.
 *
 * https://leetcode.com/problems/next-greater-element-ii/
 */
public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int[] array = new int[nums.length];

        for (int i=0;i<nums.length;i++) {
            int bigger;
            if ((bigger = findGreaterElementAfter(nums, i)) != Integer.MIN_VALUE)
                array[i] = bigger;
            else
                array[i] = findGreaterElementBefore(nums, i);
        }
        return array;
    }

    public int findGreaterElementAfter(int[] array, int offset) {
        int num = array[offset];
        for (int i=offset;i<array.length;i++) {
            if (num < array[i])
                return array[i];
        }
        return Integer.MIN_VALUE;
    }

    public int findGreaterElementBefore(int[] array, int offset) {
        int num = array[offset];
        for (int i=0;i<offset;i++)
            if (num < array[i])
                return array[i];

        return -1;
    }

    //From solutions
    public int[] nextGreaterElements1(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length])
                stack.pop();

            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }
}
