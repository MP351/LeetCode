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

		String str = String.valueOf(n);
		char[] chars = str.toCharArray();
		for (int i=chars.length-2;i>=0;i--) {
			int index;
			if ((index = getCloserBigger(chars, i)) != -1) {
				char tmp = chars[i];
				chars[i] = chars[index];
				chars[index] = tmp;

				sortNumString(chars, i+1);
				long ret = Long.parseLong(new String(chars));
				if (ret <= Integer.MAX_VALUE)
					return (int) ret;
			}
		}
		return -1;
	}

	public void sortNumString(char[] str, int offset) {
		for (int i=offset;i<str.length;i++) {
			for (int j=i;j<str.length;j++) {
				if (str[i] > str[j]) {
					char tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
	}

	public int getCloserBigger(char[] str, int offset) {
		int closer = Integer.MAX_VALUE;
		int retOffset = -1;
		char ch = str[offset];

		for (int i=str.length-1;i>offset;i--) {
			if (str[i] > ch && str[i] < closer) {
				closer = str[i];
				retOffset = i;
			}
		}
		return retOffset;
	}
}
