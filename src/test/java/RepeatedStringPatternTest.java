import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class RepeatedStringPatternTest {
	private HashMap<String, Boolean> input = new HashMap<>();

	@Before
	public void setUp() {
		input.put("aaaaaaaaaa", true);
		input.put("abcabcabc", true);
		input.put("abdgabd", false);
		input.put("a", false);
		//input.put(null, false);
		input.put("bbbbbbbbbh", false);
		input.put("abab", true);
		input.put("abababababfab", false);
	}

	@Test
	public void repeatedSubstringPattern() {
		RepeatedStringPattern rsp = new RepeatedStringPattern();
		for (String key : input.keySet()) {
			System.out.println(key + " - " + input.get(key));
			assertEquals(input.get(key), rsp.repeatedSubstringPattern1(key));
		}
	}
}