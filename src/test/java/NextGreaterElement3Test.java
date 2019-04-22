import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElement3Test {
	private NextGreaterElement3 nge = new NextGreaterElement3();

	@Test
	public void t1() {
		int input = 54321;
		int output = -1;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void t2() {
		int input = 5247;
		int output = 5274;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void t3() {
		int input = 547812564;
		int output = 547812645;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void t4() {
		int input = 12443322;
		int output = 13222344;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void twoDigNum() {
		int input = 54;
		int output = -1;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void twoDigValid() {
		int input = 45;
		int output = 54;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void bigNumTest() {
		int input = 1999999999;
		int output = -1;
		assertEquals(output, nge.nextGreaterElement(input));
	}

	@Test
	public void sortNumStr1() {
		String input = "51247";
		String output = "12457";
		char[] ch = input.toCharArray();

		nge.sortNumString(ch, 0);
		assertArrayEquals(output.toCharArray(), ch);
	}

	@Test
	public void sortNumStr2() {
		String input = "51";
		String output = "15";
		char[] ch = input.toCharArray();

		nge.sortNumString(ch, 0);
		assertArrayEquals(output.toCharArray(), ch);
	}


	@Test
	public void sortNumStr3() {
		String input = "5";
		String output = "5";
		char[] ch = input.toCharArray();

		nge.sortNumString(ch, 0);
		assertArrayEquals(output.toCharArray(), ch);
	}

	@Test
	public void findingCloserBiggerNum() {
		char[] inStr = { '1', '2', '3', '6', '5', '4' };
		int inOffset = 1;

		assertEquals(2, nge.getCloserBigger(inStr, inOffset));
	}

	@Test
	public void findingCloserBiggerTwoNum() {
		char[] inStr = { '5', '2', '4', '7' };
		int inOffset = 2;

		assertEquals(3, nge.getCloserBigger(inStr, inOffset));
	}
}