/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplStrStr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return 0;
		if (needle.equals(""))
			return 0;

		for (int i=0;i<haystack.length()-needle.length()+1;i++) {

			System.out.println(haystack.charAt(i + needle.length()/2) == needle.charAt(needle.length()/2));
			if (haystack.charAt(i) == needle.charAt(0) &&
					(haystack.charAt(i + needle.length()/2) == needle.charAt(needle.length()/2))) {
				if (strStrStr(haystack.substring(i), needle))
					return i;
			}
		}
		return -1;
	}

	private boolean strStrStr(String haystack, String needle) {
		System.out.println(haystack + " - " + needle);
		for (int i=0;i < needle.length();i++) {
			if (haystack.length() == i || haystack.charAt(i) != needle.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
