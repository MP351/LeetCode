import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
	private HashMap<String, Boolean> input = new HashMap<>();

	@Before
	public void setUp() {
		input.put("", true);
		//input.put(null, false);
		input.put("{}{}[]()", true);
		input.put("{[{()}]}({})", true);
		input.put("{}]{}{}{}", false);
		input.put("}{", false);
		input.put("{", false);
		input.put("}", false);
	}

	@Test
	public void isValid() {
		ValidParentheses vp = new ValidParentheses();
		for (String key : input.keySet()) {
			System.out.println(key);
			assertEquals(input.get(key), vp.isValid(key));
		}
	}
}