/**
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 *
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        if (S == null || S.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (counter != 0)
                    sb.append(c);
                counter++;
            } else if (c == ')') {
                counter--;
                if (counter != 0)
                    sb.append(c);
            }
        }
        return sb.toString();
    }
}
