/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Note:
 *
 *     1 <= S.length <= 200
 *     1 <= T.length <= 200
 *     S and T only contain lowercase letters and '#' characters.
 *
 * https://leetcode.com/problems/backspace-string-compare/
 */

public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        if (S == null || T == null)
            return false;

        int counter = 0;
        StringBuilder sb1 = new StringBuilder();
        for (int i=S.length()-1;i>=0;i--) {
            if (S.charAt(i) == '#')
                counter++;
            else if (counter > 0) {
                counter--;
            } else sb1.append(S.charAt(i));
        }

        counter = 0;
        StringBuilder sb2 = new StringBuilder();
        for (int i=T.length()-1;i>=0;i--) {
            if (T.charAt(i) == '#')
                counter++;
            else if (counter > 0) {
                counter--;
            } else sb2.append(T.charAt(i));
        }
        return sb1.toString().equals(sb2.toString());
    }
}
