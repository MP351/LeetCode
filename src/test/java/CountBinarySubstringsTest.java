import org.junit.Test;

import static org.junit.Assert.*;

public class CountBinarySubstringsTest {
    private CountBinarySubstrings cbs = new CountBinarySubstrings();

    @Test
    public void nullString() {
        assertEquals(0, cbs.countBinarySubstrings(null));
    }

    @Test
    public void emptyString() {
        assertEquals(0, cbs.countBinarySubstrings(""));
    }

    @Test
    public void sixStrings() {
        String str = "00110011";
        assertEquals(6, cbs.countBinarySubstrings(str));
    }

    @Test
    public void fourStrings() {
        String str = "10101";
        assertEquals(4, cbs.countBinarySubstrings(str));
    }

    @Test
    public void zeroesString() {
        String str = "000000";
        assertEquals(0, cbs.countBinarySubstrings(str));
    }

    @Test
    public void stringCount() {
        String str = "0011";
        assertEquals(2, cbs.getStringCount(str, 2));
    }
}