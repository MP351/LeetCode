import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringTest {
	private ReverseWordsInString rws = new ReverseWordsInString();

	@Test
	public void t1() {
		String input = "the sky is blue";
		String output = "blue is sky the";
		assertEquals(output, rws.reverseWords(input));
	}

	@Test
	public void t2() {
		String input = "   word    torj!  !    l    ";
		String output = "l ! torj! word";

		assertEquals(output, rws.reverseWords(input));
	}
}