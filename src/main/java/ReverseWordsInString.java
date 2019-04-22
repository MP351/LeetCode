/**
 * Given an input string, reverse the string word by word.
 *
 * Example 1:
 *
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 *
 * https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class ReverseWordsInString {
	public String reverseWords(String s) {
		String str;
		if (s == null || s.isEmpty() || (str = s.trim()).isEmpty())
			return "";

		String[] array = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i=array.length-1;i>=0;i--) {
			if (!array[i].isEmpty()) {
				sb.append(array[i]);
				if (i > 0)
					sb.append(" ");
			}
		}

		return sb.toString();
	}
}
