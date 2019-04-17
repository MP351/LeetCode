import java.util.ArrayList;

/**
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * Example 1:
 *
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
 *
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 *
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 *
 * https://leetcode.com/problems/count-binary-substrings/
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int count = 0;
        for (int i=1;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(i-1))
                count += getStringCount(s, i);
        }

        return count;
    }

    public int getStringCount(String s, int offset) {
        char begin = s.charAt(offset-1);
        char end = s.charAt(offset);

        int count = 0;
        for (int i = offset-1, j = offset;i >= 0 && j < s.length() &&
                s.charAt(i) == begin && s.charAt(j) == end;i--,j++) {
            count++;
        }
        return count;
    }
}
