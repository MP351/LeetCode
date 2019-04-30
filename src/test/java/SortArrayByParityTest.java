import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayByParityTest {
    SortArrayByParity sp = new SortArrayByParity();

    @Test
    public void test() {
        int[] A = new int[] { 3, 1, 2, 4 };
        int[] output = new int[] { 2, 4, 1, 3 };
        assertArrayEquals(output, sp.sortArrayByParity(A));
    }
}