import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTwoArraysTest {
	IntersectionTwoArrays ia = new IntersectionTwoArrays();

	@Test
	public void t1() {
		int[] input1 = { 1, 2, 2, 1 };
		int[] input2 = { 2, 2 };
		int[] output = { 2 };

		assertArrayEquals(output, ia.intersection(input1, input2));
	}

	@Test
	public void t2() {
		int[] input1 = { 8, 0, 3 };
		int[] input2 = { 0, 0 };
		int[] output = { 0 };

		assertArrayEquals(output, ia.intersection(input1, input2));
	}
}