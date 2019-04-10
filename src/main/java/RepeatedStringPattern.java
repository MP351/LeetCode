/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending
 * multiple copies of the substring together. You may assume the given string consists of lowercase
 * English letters only and its length will not exceed 10000.
 *
 * https://leetcode.com/problems/repeated-substring-pattern/
 */
public class RepeatedStringPattern {
	public boolean repeatedSubstringPattern(String s) {
		if (s == null)
			return false;
		if (s.isEmpty())
			return false;
		if (s.length() == 1)
			return false;

		char firstLetter = s.charAt(0);
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i) == firstLetter) {
				if (check(s, i))
					return true;
			}
		}
		return false;
	}

	private boolean check(String s, int count) {
		if (s.length() % count != 0)
			return false;

		String str = s.substring(0, count);
		for (int i=count;i<=s.length();i+=count) {
			if (!str.equals(s.substring(i-count, i)))
				return false;
		}
		return true;
	}

	//Solution from discussion
	public boolean repeatedSubstringPattern1(String s) {
		String str = s + s;
		return str.substring(1, str.length() - 1).contains(s);
	}
}
