import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoveDuplicatesSortedArray2Test {
    private RemoveDuplicatesSortedArray2 rd = new RemoveDuplicatesSortedArray2();

    @Test
    public void usualCase() {
        int[] array = new int[] { 1, 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5 };
        int endL = 8;
        int[] arrayA = new int[] { 1, 1, 2, 3, 3, 4, 5, 5 };

        assertEquals(endL, rd.removeDuplicates(array));

        int[] controlArray = Arrays.copyOf(array, endL);
        assertArrayEquals(arrayA, controlArray);
    }

    @Test
    public void threeElem() {
        int[] array = new int[] { 1, 1, 1 };
        int endL = 2;
        int[] arrayA = new int[] { 1, 1 };

        assertEquals(endL, rd.removeDuplicates(array));

        int[] controlArray = Arrays.copyOf(array, endL);
        assertArrayEquals(arrayA, controlArray);
    }

    @Test
    public void emptyArray() {
        int[] array = new int[0];
        assertEquals(0, rd.removeDuplicates(array));
    }

    @Test
    public void toTheEndTesting() {
        int[] array = new int[] { 1, 1, 2, 3 };
        int[] arrayEnd = new int[] { 1, 2, 3, 1 };
        rd.moveToTheEnd(array, 1);

        assertArrayEquals(array, arrayEnd);
    }

    @Test
    public void toTheEndFTEnd() {
        int[] array = new int[] { 1, 2, 2, 3 };
        int[] arrayEnd = new int[] { 1, 2, 3, 2 };
        rd.moveToTheEnd(array, 2);

        assertArrayEquals(array, arrayEnd);
    }
}