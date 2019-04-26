import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTwoArrays2Test {
	IntersectionTwoArrays2 ia2 = new IntersectionTwoArrays2();

	@Test
	public void test() {
		int[] input1 = { 1, 2, 2, 1 };
		int[] input2 = { 2, 2 };
		int[] output = { 2, 2 };

		assertArrayEquals(output, ia2.intersect(input1, input2));
	}
}