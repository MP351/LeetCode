import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresSortedArrayTest {
    SquaresSortedArray ssa = new SquaresSortedArray();

    @Test
    public void binSearchTest() {
        int[] input = new int[] {  0, 2, 10, 10, 10, 15, 20 } ;
        int output = 0;

        assertEquals(output, ssa.findMin(input));
    }

    @Test
    public void binSearchTestOfTwo() {
        int[] input = new int[] { -4, -1 } ;
        int output = 1;

        assertEquals(output, ssa.findMin(input));
    }

    @Test
    public void binSearchTestOfLast() {
        int[] input = new int[] { -4, -2, -1, 0 } ;
        int output = 3;

        assertEquals(output, ssa.findMin(input));
    }

    @Test
    public void test() {
        int[] input = new int[] { -4, -1, 0, 0, 3, 10 } ;
        int[] output = new int[] { 0, 0, 1, 9, 16, 100 };

        assertArrayEquals(output, ssa.sortedSquares1(input));
    }

    @Test
    public void test1() {
        int[] input = new int[] { -4, -1 } ;
        int[] output = new int[] { 1, 16 };

        assertArrayEquals(output, ssa.sortedSquares1(input));
    }

    @Test
    public void test2() {
        int[] input = new int[] { -7, -3, 2, 3, 11 } ;
        int[] output = new int[] { 4, 9, 9, 49, 121 };

        assertArrayEquals(output, ssa.sortedSquares1(input));
    }
}