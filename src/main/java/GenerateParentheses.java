import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * https://leetcode.com/problems/generate-parentheses/
 */

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		if (n < 1)
			return null;

		ArrayList<String> output = new ArrayList<>();
		StringBuilder sb = new StringBuilder(n*2);

		for (int i=0;i<n;i++) {
			sb.append("()");
		}
		//TODO:


		return null;
	}
}
