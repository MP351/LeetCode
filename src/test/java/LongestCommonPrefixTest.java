import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
	private LongestCommonPrefix lcp = new LongestCommonPrefix();

	@Test
	public void emptyArray() {
		String[] array = new String[] {};
		assertEquals("", lcp.longestCommonPrefix(array));
	}

	public void nullArray() {
		String[] array = null;
		assertEquals("", lcp.longestCommonPrefix(array));
	}

	@Test
	public void oneCommonPrefix() {
		String[] array = new String[] { "flower","flow","flight" };
		assertEquals("fl", lcp.longestCommonPrefix(array));
	}

	@Test
	public void twoCommonPrefixes() {
		String[] array = new String[] { "flower","flow","flight", "fli", "flit" };
		assertEquals("fl", lcp.longestCommonPrefix(array));
	}

	@Test
	public void difLength() {
		String[] array = new String[] { "aa", "a" };
		assertEquals("a", lcp.longestCommonPrefix(array));
	}
}