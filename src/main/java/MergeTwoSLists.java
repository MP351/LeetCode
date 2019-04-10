import ds.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		else if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;

		ListNode answL;
		ListNode toRet;
		if (l1.val < l2.val) {
			answL = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			answL = new ListNode(l2.val);
			l2 = l2.next;
		}
		toRet = answL;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				answL.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				answL.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			answL = answL.next;
		}

		if (l1 == null)
			answL.next = l2;
		else
			answL.next = l1;
		return toRet;
	}
}
