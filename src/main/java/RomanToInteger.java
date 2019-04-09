import java.util.TreeMap;

/**
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        s = s.trim();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int answ = 0;

        for (int i=0;i<s.length();i++) {
            if (i+1 < s.length())
                if (hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1)))
                    answ += hm.get(s.charAt(i));
                else
                    answ -= hm.get(s.charAt(i));
            else
                answ += hm.get(s.charAt(i));

        }

        return answ;
    }
}
