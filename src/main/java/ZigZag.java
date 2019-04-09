/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        int step = numRows + numRows - 2;
        int offset = step;
        int addOffset = 0;

        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<numRows && i < s.length();i++) {
            sb.append(s.charAt(i));
            for (int j=i+offset;j<s.length();j+=offset) {
                if (offset > 0) {
                    sb.append(s.charAt(j));
                }
                j += addOffset;
                if (addOffset > 0 && j < s.length()) {
                    sb.append(s.charAt(j));
                }
            }
            offset -= 2;
            addOffset += 2;
        }

        return sb.toString();
    }
}
