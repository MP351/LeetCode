/**
 * Given a positive 32-bit integer n, you need to find the smallest 32-bit integer which has exactly the same digits
 * existing in the integer n and is greater in value than n. If no such positive 32-bit integer exists, you need to
 * return -1.
 *
 * https://leetcode.com/problems/next-greater-element-iii/
 */
public class NextGreaterElement3 {
	public int nextGreaterElement(int n) {
		if (n < 12)
			return -1;

		//FIXME
		String str = String.valueOf(n);
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		for (int i=str.length()-2;i>=0;i--) {
			for (int j=i+1;j<str.length();j++) {
				if (sb.charAt(i) < str.charAt(j)) {
					char tmp = sb.charAt(i);
					sb.setCharAt(i, sb.charAt(j));
					sb.setCharAt(j, tmp);

					sb.replace(i+1, sb.length(), sortNumString(sb.substring(i+1)));

					if (Long.parseLong(sb.toString()) > Integer.MAX_VALUE)
						return -1;

					return Integer.parseInt(sb.toString());
				}
			}
		}
		return -1;
	}

	public String sortNumString(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i=0;i<str.length();i++) {
			for (int j=i;j<str.length();j++) {
				if (sb.charAt(i) > sb.charAt(j)) {
					char tmp = sb.charAt(i);
					sb.setCharAt(i, sb.charAt(j));
					sb.setCharAt(j, tmp);
				}
			}
		}
		return sb.toString();
	}
}
