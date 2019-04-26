import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
	ValidAnagram va = new ValidAnagram();

	@Test
	public void t1() {
		String input1 = "anagram";
		String input2 = "nagaram";

		assertTrue(va.isAnagram(input1, input2));
	}

	@Test
	public void t2() {
		String input1 = "rat";
		String input2 = "car";

		assertFalse(va.isAnagram(input1, input2));
	}

	@Test
	public void t3() {
		String input1 = "aacc";
		String input2 = "ccac";

		assertFalse(va.isAnagram(input1, input2));
	}
}