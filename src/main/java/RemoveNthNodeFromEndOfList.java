import ds.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEndList(ListNode head, int n) {
        if (n == 0)
            return head;
        ListNode list = head;
        ListNode tail = head;
        int count = 0;

        while (list.next != null) {
            if (count < n)
                count++;
            else
                tail = tail.next;
            list = list.next;
        }

        if (count == n)
            tail.next = tail.next.next;
        else
            head = head.next;

        return head;
    }
}
