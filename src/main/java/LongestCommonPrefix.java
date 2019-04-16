import java.util.HashMap;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * https://leetcode.com/problems/longest-common-prefix/
 */

public class LongestCommonPrefix {
	public String longestCommonPrefix1(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		for (int i=0;i<strs[0].length();i++) {
			for (int j=0;j<strs.length;j++) {
				//if (strs[j].charAt(i))
				//TODO:
			}
		}
		return "";
	}

	public String longestCommonPrefix(String[] strs) {
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
