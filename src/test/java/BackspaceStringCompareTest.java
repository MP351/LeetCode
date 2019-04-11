import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareTest {
    private BackspaceStringCompare bc = new BackspaceStringCompare();

    private void testing(String s1, String s2) {
        System.out.println(s1 + " : " + s2);
        assertTrue(bc.backspaceCompare(s1, s2));
    }

    @Test
    public void test1() {
        assertTrue(bc.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2() {
        assertTrue(bc.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertTrue(bc.backspaceCompare("aa##c", "#a#c"));
    }

    @Test
    public void test4() {
        assertFalse(bc.backspaceCompare("a#c", "b"));
    }
}