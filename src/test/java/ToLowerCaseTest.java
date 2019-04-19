import org.junit.Test;

import static org.junit.Assert.*;

public class ToLowerCaseTest {
    private ToLowerCase tlc = new ToLowerCase();

    @Test
    public void t1() {
        String input = "HellO";
        String output = input.toLowerCase();
        assertEquals(output, tlc.toLowerCase(input));
    }
}