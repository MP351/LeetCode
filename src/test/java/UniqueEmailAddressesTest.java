import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressesTest {
	UniqueEmailAddresses uea = new UniqueEmailAddresses();

	@Test
	public void invalidEmail() {
		String[] input = new String[] { "dewedw.scsd.com", "fvdfvdvd.vd.gmail.com", "ccfscfs+f@gmail.com" };
		assertEquals(1, uea.numUniqueEmails(input));
	}

	@Test
	public void nullEmails() {
		String[] input = new String[] { "fvdfvdvd.vd@gmail.com", "ccfscfs+f@gmail.com", null };
		assertEquals(2, uea.numUniqueEmails(input));
	}

	@Test
	public void sameAddresses() {
		String[] input = { "goo.gle@gmail.com", "google+tested@gmail.com", "just.another.email@yandex.ru" };
		assertEquals(2, uea.numUniqueEmails(input));
	}
}