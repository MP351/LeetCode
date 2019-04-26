import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElement2Test {
    NextGreaterElement2 nge2 = new NextGreaterElement2();

    @Test
    public void greaterElemAfterNone() {
        int[] input = new int[] { 2, 3, 5, 7, 4 };
        assertEquals(-1, nge2.findGreaterElementAfter(input, 3));
    }

    @Test
    public void greaterElemAfterFind() {
        int[] input = new int[] { 2, 3, 1, 7, 4 };
        assertEquals(7, nge2.findGreaterElementAfter(input, 1));

    }

    @Test
    public void greaterElemBeforeNone() {
        int[] input = new int[] { 2, 3, 5, 7, 4 };
        assertEquals(-1, nge2.findGreaterElementBefore(input, 3));
    }

    @Test
    public void greaterElemBeforeFind() {
        int[] input = new int[] { 2, 8, 5, 7, 4 };
        assertEquals(8, nge2.findGreaterElementBefore(input, 3));
    }


    private int[] input = new int[] { 2, 3, 4, 1, 6, 3, 4, 10 };
    @Test
    public void greaterElem() {
        int[] output = new int[] { 3, 4, 6, 6, 10, 4, 10, -1 };
        assertArrayEquals(output, nge2.nextGreaterElements1(input));
    }

    @Test
    public void t3() {
        int[] input = new int[] { 1, 8, -1, -100, -1, 222, 1111111, -111111 };
        int[] output = new int[] { 8, 222, 222, -1, 222, 1111111, -1, 1 };
        assertArrayEquals(output, nge2.nextGreaterElements1(input));
    }

    @Test
    public void t4() {
        int[] input = new int[] { 3, 8, 4, 1, 2 };
        int[] output = new int[] { 8, -1, 8, 2, 3 };

        assertArrayEquals(output, nge2.nextGreaterElements1(input));
    }
}