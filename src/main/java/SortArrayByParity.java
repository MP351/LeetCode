/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 *
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] sorted = new int[A.length];

        int oddCounter = A.length-1;
        int evenCounter = 0;
        for (int elem : A) {
            if (elem % 2 == 0)
                sorted[evenCounter++] = elem;
            else
                sorted[oddCounter--] = elem;
        }

        return sorted;
    }
}
