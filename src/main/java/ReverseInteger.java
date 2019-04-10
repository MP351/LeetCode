/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * https://leetcode.com/problems/reverse-integer/
 */

public class ReverseInteger {
	public int reverse(int x) {
		String ans;
		if (x < 0) {
			x *= -1;
			ans = "-";
		} else {
			ans = "";
		}
		String in = String.valueOf(x);
		for (int i=in.length()-1;i>=0;i--) {
			ans += in.charAt(i);
		}

		int answ;
		try {
			answ = Integer.parseInt(ans);
		} catch (Exception e) {
			return 0;
		}

		return answ;
	}
}
