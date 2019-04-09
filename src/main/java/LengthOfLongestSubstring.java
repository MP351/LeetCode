import java.util.TreeSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        TreeSet<Integer> setL = new TreeSet<>();
        if (s.isEmpty())
            return 0;

        String string = "";
        int count = 0;
        for (int i=0;i<s.length();i++) {
            if (isContains(string, s.charAt(i))) {
                setL.add(string.length());
                string = "";
                i = count++;
            } else {
                string += s.charAt(i);
            }
        }

        setL.add(string.length());

        if (setL.size() > 0)
            return setL.last();
        else
            return 1;
    }

    private static boolean isContains(String str, Character c) {
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == c)
                return true;
        }
        return false;
    }
}
