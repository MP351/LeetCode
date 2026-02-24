package ds;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;


    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode fromList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(list.get(0));
        ListNode pointer = head;

        for (int i=1;i<list.size();i++) {
            ListNode node = new ListNode(list.get(i));

            pointer.next = node;
            pointer = node;
        }
        return head;
    }

//    public static int[] toArray(ListNode head) {
//        if (head == null) {
//            return new int[] {};
//        }
//
//        ListNode pointer = head;
//
//        int count = 0;
//        while (pointer != null) {
//            count++;
//            pointer = pointer.next;
//        }
//
//        int[] array = new int[count];
//        pointer = head;
//        count = 0;
//        while (pointer != null) {
//            array[count++] = pointer.val;
//            pointer = pointer.next;
//        }
//
//        return array;
//    }

    public static int[] toArray(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean equals(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = this;

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val != pointer2.val) {
                return false;
            }

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return pointer1 == null && pointer2 == null;
    }
}