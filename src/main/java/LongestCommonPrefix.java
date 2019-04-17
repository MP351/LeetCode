import java.util.HashMap;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * https://leetcode.com/problems/longest-common-prefix/
 */

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		StringBuilder sb = new StringBuilder();
		for (int i=0;i<strs[0].length();i++) {
			char ch = strs[0].charAt(i);
			for (int j=0;j<strs.length;j++) {
				if (strs[j].length()-1 < i || strs[j].charAt(i) != ch)
					return sb.toString();
			}
			sb.append(ch);
		}
		return sb.toString();
	}


	//From discussion
	public String longestCommonPrefix2(String[] strs) {
		if (strs.length == 0) return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		return prefix;
	}
}
