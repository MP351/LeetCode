import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {
    private LengthOfLastWord llw = new LengthOfLastWord();

    @Test
    public void nullString() {
        assertEquals(0, llw.lengthOfLastWord(null));
    }

    @Test
    public void emptyString() {
        assertEquals(0, llw.lengthOfLastWord(""));
    }

    @Test
    public void test1() {
        String str = "Hello World";
        assertEquals(5, llw.lengthOfLastWord(str));
    }

    @Test
    public void spacesEndString() {
        String str = "Hello    ";
        assertEquals(5, llw.lengthOfLastWord(str));
    }

    @Test
    public void spaceString() {
        String str = "       ";
        assertEquals(0, llw.lengthOfLastWord(str));
    }
}