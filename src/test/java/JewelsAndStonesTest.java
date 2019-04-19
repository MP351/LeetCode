import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {
    private JewelsAndStones jas = new JewelsAndStones();

    @Test
    public void validString1() {
        assertEquals(3, jas.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void validString2() {
        assertEquals(3, jas.numJewelsInStones("abd", "bbb"));
    }
}