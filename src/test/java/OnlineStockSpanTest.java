import org.junit.Test;

import static org.junit.Assert.*;

public class OnlineStockSpanTest {
	@Test
	public void validTest() {
		OnlineStockSpan oss = new OnlineStockSpan();
		assertEquals(1, oss.next(10));
		assertEquals(2, oss.next(20));
		assertEquals(3, oss.next(20));
		assertEquals(1, oss.next(15));
	}

}