import java.util.LinkedList;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s == null || t == null)
			return false;
		if (s.isEmpty() || t.isEmpty())
			return true;

		boolean flag = false;
		char[] words;
		char[] w2;
		if (s.length() < t.length()) {
			words = s.toCharArray();
			w2 = t.toCharArray();
		} else {
			words = t.toCharArray();
			w2 = s.toCharArray();
		}

		for (char al : w2) {
			for (int i=0;i<words.length;i++) {
				if (al == words[i]) {
					flag = true;
					words[i] = 0;
					break;
				}
				flag = false;
			}
			if (!flag)
				break;
		}
		return flag;
	}
}
