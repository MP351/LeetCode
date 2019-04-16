import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {
	private GenerateParentheses gp;

	@Before
	public void setUp() {
		gp = new GenerateParentheses();
	}

	@Test
	public void n3Par() {
		ArrayList<String> list = new ArrayList<>();
		list.add("()()()");
		list.add("()(())");
		list.add("(())()");
		list.add("(()())");
		list.add("((()))");

		assertTrue(compareLists(list, gp.generateParenthesis(3)));
	}

	@Test
	public void n1Par() {
		ArrayList<String> list = new ArrayList<>();
		list.add("()");

		assertTrue(compareLists(list, gp.generateParenthesis(1)));
	}

	@Test
	public void n6Par() {
		ArrayList<String> list = new ArrayList<>();
		list.add("()()()()()()");
		list.add("()()()()(())");
		list.add("()()()(())()");
		list.add("()()(())()()");
		list.add("()(())()()()");
		list.add("(())()()()()");
		list.add("((()))()()()");
		list.add("()((()))()()");
		list.add("()()((()))()");
		list.add("()()()((()))");
		list.add("()()(((())))");
		list.add("()(((())))()");
		list.add("(((())))()()");
		list.add("((((()))))()");
		list.add("()((((()))))");
		list.add("(((((())))))");

		assertTrue(compareLists(list, gp.generateParenthesis(6)));
	}

	private boolean compareLists(List<String> list1, List<String> list2) {
		if (list1.size() != list2.size())
			return false;

		for (String str : list1) {
			if (!list2.contains(str))
				return false;
		}
		return true;
	}
}