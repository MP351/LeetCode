import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElement1Test {
    NextGreaterElement1 nge = new NextGreaterElement1();

    @Test
    public void getBiggerTest() {
        int[] input = new int[] { 1, 2, 3, 0, -2 ,9 };
        assertEquals(9, nge.getBiggerRighter(input, 0));
    }

    @Test
    public void ngeText() {
        int[] input1 = new int[] { 4, 1, 2 };
        int[] input2 = new int[] { 1, 3, 4, 2 };
        int[] output = new int[] { -1, 3, -1 };

        assertArrayEquals(output, nge.nextGreaterElement(input1, input2));
    }
}