import org.junit.Test;

import static org.junit.Assert.*;

public class NRepeatedElementSize2NArrayTest {
	NRepeatedElementSize2NArray nra = new NRepeatedElementSize2NArray();

	@Test
	public void valid() {
		int[] input = { 1, 2, 3, 3 };
		int output = 3;

		assertEquals(output, nra.repeatedNTimesHS(input));
	}
}