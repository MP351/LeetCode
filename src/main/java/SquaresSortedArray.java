/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] A) {
        int[] sorted = new int[A.length];
        int minIndex = findMin(A);

        int plusCount = minIndex+1;
        int minusCount = minIndex-1;

        sorted[0] = A[minIndex] * A[minIndex];
        for (int i=1;i<sorted.length;i++) {
            if (plusCount < A.length && minusCount >= 0)
                if (Math.abs(A[plusCount]) <= Math.abs(A[minusCount])) {
                    sorted[i] = (int) Math.pow(Math.abs(A[plusCount++]), 2);
                } else
                    sorted[i] = (int) Math.pow(Math.abs(A[minusCount--]), 2);
            else if (plusCount < A.length)
                sorted[i] = (int) Math.pow(Math.abs(A[plusCount++]), 2);
            else
                sorted[i] = (int) Math.pow(Math.abs(A[minusCount--]), 2);
        }

        for (int i=0;i<sorted.length;i++)
            System.out.print(sorted[i] + " ");
        System.out.println();
        return sorted;
    }

    public int findMinElemIndex(int[] A) {
        for (int i=A.length/2;i<A.length-1 && i > 0;) {
            if (Math.abs(A[i]) <= Math.abs(A[i-1]) && Math.abs(A[i]) < Math.abs(A[i+1]))
                return i;
            else if (Math.abs(A[i]) > Math.abs(A[i-1]))
                i /= 2;
            else
                i += i/2;
        }
        return 0;
    }

    public int findMin(int[] A) {
        int i=-1;
        int x = 0;
        int xMin = Integer.MAX_VALUE;
        int xInd = -1;
        if (A == null)
            return i;

        int low = 0, high = A.length, mid;
        while (low < high) {
            mid = (low + high) >>> 1;
            if (x == A[mid]) {
                return mid;
            } else {
                if (x < A[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
                if (Math.abs(A[mid]) < xMin) {
                    xInd = mid;
                    xMin = Math.abs(A[mid]);
                }
            }
        }

        return xInd;
    }

    //From discussion
    public int[] sortedSquares1(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
