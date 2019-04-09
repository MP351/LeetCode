import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class IntegerToRomanTest {
    private final Map<String, Integer> toRomanTestData = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        toRomanTestData.put("X", 10);
        toRomanTestData.put("MCMXCIV", 1994);
        toRomanTestData.put("LVIII", 58);
        toRomanTestData.put("MMMCMXCIX", 3999);
    }

    @Test
    public void intToRoman() {
        IntegerToRoman itr = new IntegerToRoman();
        for (String key : toRomanTestData.keySet()) {
            assertEquals(key, itr.intToRoman(toRomanTestData.get(key)));
        }
    }
}