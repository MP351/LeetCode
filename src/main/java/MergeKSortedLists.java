import ds.ListNode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;

		PriorityQueue<ListNode> pq
				= new PriorityQueue<>(lists.length, Comparator.comparingInt(ln -> ln.val));

		for (ListNode ln : lists) {
			if (ln != null)
				pq.add(ln);
		}

		if (pq.isEmpty())
			return null;

		ListNode root = new ListNode(pq.peek().val);
		ListNode it = root;



		while (!pq.isEmpty()) {
			it.next = pq.poll();
			it = it.next;

			if (it.next != null) {
				pq.add(it.next);
			}
		}

		return root;
	}
}
