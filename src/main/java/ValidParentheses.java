import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *     Open brackets must be closed by the same type of brackets.
 *     Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 *
 * https://leetcode.com/problems/valid-parentheses/
 */

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s == null)
			return false;
		if (s.isEmpty())
			return true;

		ArrayDeque<Character> deque = new ArrayDeque<>();

		try {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[')
					deque.push(ch);
				else if (ch == ')' || ch == '}' || ch == ']') {
					switch (ch) {
						case ')':
							if (deque.pop() != '(')
								return false;
							break;
						case '}':
							if (deque.pop() != '{')
								return false;
							break;
						case ']':
							if (deque.pop() != '[')
								return false;
							break;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}

		return deque.isEmpty();
	}

	//From discussion
	public boolean isValid1(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
}
