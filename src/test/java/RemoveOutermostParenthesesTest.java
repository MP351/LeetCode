import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveOutermostParenthesesTest {
    private RemoveOutermostParentheses rop = new RemoveOutermostParentheses();

    @Test
    public void nullString() {
        assertEquals("", rop.removeOuterParentheses(null));
    }

    @Test
    public void emptyString() {
        assertEquals("", rop.removeOuterParentheses(""));
    }

    @Test
    public void validParentheses1() {
        String input = "(()())(())";
        String output = "()()()";
        assertEquals(output, rop.removeOuterParentheses(input));
    }

    @Test
    public void validParentheses2() {
        String input = "(()())(())(()(()))";
        String output = "()()()()(())";
        assertEquals(output, rop.removeOuterParentheses(input));
    }

    @Test
    public void validParentheses3() {
        String input = "()()";
        String output = "";
        assertEquals(output, rop.removeOuterParentheses(input));
    }
}