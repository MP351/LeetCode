import ds.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        int[] tmp = sum(l1.val, l2.val);

        ListNode al = new ListNode(tmp[0]);

        ListNode ln = addTwoNumbers(l1.next, l2.next);
        if (ln == null) {
            if (tmp[1] > 0)
                al.next = new ListNode(tmp[1]);
            return al;
        }
        al.next = addTwoNumbers(new ListNode(tmp[1]), ln);
        return al;
    }

    int[] sum(int v1, int v2) {
        int[] ans = new int[2];

        int dig = v1 + v2;
        if (dig > 9) {
            ans[0] = dig % 10;
            ans[1] = dig / 10;
        } else {
            ans[0] = dig;
        }
        return ans;
    }
}
