/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        if (str == null || str.isEmpty())
            return null;

        int diff = 'a' - 'A';
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                sb.append(Character.toChars(ch + diff));
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}
