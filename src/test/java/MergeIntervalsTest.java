import org.junit.Test;

import static org.junit.Assert.*;

public class MergeIntervalsTest {
	MergeIntervals mi = new MergeIntervals();

	@Test
	public void inputNull() {
		assertNull(mi.merge(null));
	}

	@Test
	public void inputEmpty() {
		assertArrayEquals(new int[0][0], mi.merge(new int[0][0]));
	}

	@Test
	public void testInput1() {
		int[][] array = new int[][] { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
		int[][] expct = new int[][] { {1, 6}, {8, 10}, {15, 18} };

		assertArrayEquals(expct, mi.merge(array));
	}
}