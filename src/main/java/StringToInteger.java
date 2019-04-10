import java.util.regex.Pattern;

/**
 * Implement atoi which converts a string to an integer.
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned.
 *
 * Note:
 *     Only the space character ' ' is considered as whitespace character.
 *     Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 *
 * Example 1:
 *
 * Input: "42"
 * Output: 42
 *
 * Example 2:
 *
 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 *              Then take as many numerical digits as possible, which gets 42.
 *
 * Example 3:
 *
 * Input: "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 *
 * Example 4:
 *
 * Input: "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical
 *              digit or a +/- sign. Therefore no valid conversion could be performed.
 *
 * Example 5:
 *
 * Input: "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 *              Thefore INT_MIN (−231) is returned.
 *
 * https://leetcode.com/problems/string-to-integer-atoi/
 */

public class StringToInteger {
	public int myBiAtoi(String str) {
		int i=0;
		int mul = 1;
		if (str.isEmpty())
			return 0;
		while (str.charAt(i) == ' ') {
			i++;
			if (str.length() == i)
				return 0;
		}

		if (str.charAt(i) == '-') {
			mul = -1;
			i++;
		} else if (str.charAt(i) == '+') {
			i++;
		} else if (!isNumber(str.charAt(i))) {
			return 0;
		}

		StringBuilder number = new StringBuilder();
		for (;i<str.length();i++) {
			if (isNumber(str.charAt(i)))
				number.append(str.charAt(i));
			else
				break;
		}
		if (number.toString().length() < 1)
			return 0;

		int num;
		try {
			num = Integer.parseInt(number.toString());
		} catch (Exception e) {
			if (mul > 0) {
				return Integer.MAX_VALUE;
			} else {
				return Integer.MIN_VALUE;
			}
		}
		return num*mul;
	}

	private boolean isNumber(Character ch) {
		return ch > 47 && ch < 58;
	}

	public int myAtoi(String str) {
		Pattern pattern1 = Pattern.compile("^\\s*[-+]?\\d+(\\D*|\\d*)*");
		if (!pattern1.matcher(str).matches())
			return 0;

		int mul = 1;

		Pattern whiteSpace = Pattern.compile("^\\s*");
		Pattern letters = Pattern.compile("\\D+");
		String[] arr1 = whiteSpace.split(str);
		if (arr1[0].isEmpty()) {
			if (arr1[1].charAt(0) == '-') {
				mul = -1;
			}
		} else {
			if (arr1[0].charAt(0) == '-')
				mul = -1;
		}
		String[] arr2 = null;
		for (int i=0;i<arr1.length;i++) {
			arr2 = letters.split(arr1[i]);
		}

		String output = "";
		for (String string : arr2) {
			if (!string.isEmpty())
				output += string;
		}

		int answ;
		try {
			answ = Integer.parseInt(output);
		} catch (Exception e) {
			if (mul > 0)
				return Integer.MAX_VALUE;
			else
				return Integer.MIN_VALUE;
		}
		System.out.println(pattern1.matcher(str).matches());
		return answ;
	}
}
