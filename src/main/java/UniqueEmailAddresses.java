import java.util.HashSet;

/**
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * If you add periods ('.') between some characters in the local name part of an email address,
 * mail sent there will be forwarded to the same address without dots in the local name.
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 * (Note that this rule does not apply for domain names.)
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.
 * (Again, this rule does not apply for domain names.)
 * It is possible to use both of these rules at the same time.
 * Given a list of emails, we send one email to each address in the list.
 * How many different addresses actually receive mails?
 *
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddresses {
	public int numUniqueEmails(String[] emails) {
		if (emails == null || emails.length == 0)
			return 0;

		HashSet<String> hs = new HashSet<>();
		for (String email : emails) {
			if (email == null)
				continue;

			email = email.trim();
			if (email.isEmpty())
				continue;

			String[] parts = email.split("@");
			if (parts.length < 2)
				continue;
			StringBuilder sb = new StringBuilder();

			for (char ch : parts[0].toCharArray()) {
				if (ch == '+')
					break;
				if (ch != '.')
					sb.append(ch);
			}
			sb.append('@');
			sb.append(parts[1]);
			hs.add(sb.toString());
		}
		return hs.size();
	}
}
