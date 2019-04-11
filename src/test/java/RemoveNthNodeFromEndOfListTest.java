import ds.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class RemoveNthNodeFromEndOfListTest {
    ListNode ln1;
    ListNode ln2;
    ListNode ln3;
    ListNode ln4;
    RemoveNthNodeFromEndOfList rnnfl = new RemoveNthNodeFromEndOfList();

    @Before
    public void setUp() {
        ln1 = new ListNode(0);
        ln1.next = new ListNode(1);
        ln1.next.next = new ListNode(2);
        ln1.next.next.next = new ListNode(3);

        ln2 = new ListNode(1);
        ln2.next = new ListNode(2);
        ln2.next.next = new ListNode(4);
        ln2.next.next.next = new ListNode(7);

        ln3 = new ListNode(9);
        ln3.next = new ListNode(10);
        ln3.next.next = new ListNode(11);
        ln3.next.next.next = new ListNode(10);
        ln3.next.next.next.next = new ListNode(999);
        ln3.next.next.next.next.next = new ListNode(1000);

        ln4 = new ListNode(1);
        ln4.next = new ListNode(2);
    }

    private int[] toArray(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null){
            arrayList.add(head.val);
            head = head.next;
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void removeNthFromEndList() {
        System.out.println("Test ln1");
        //0, 1, 2, 3
        int[] lnarr1 = new int[] { 0, 1, 3 };
        assertArrayEquals(lnarr1, toArray(rnnfl.removeNthFromEndList(ln1, 2)));
    }

    @Test
    public void remove1stItemInList() {
        System.out.println("Test ln3");
        int[] lnarr3 = new int[] { 10, 11, 10, 999, 1000 };
        assertArrayEquals(lnarr3, toArray(rnnfl.removeNthFromEndList(ln3, 6)));
    }

    @Test
    public void removeLastItemInListOf2() {
        System.out.println("Test ln4");
        int[] lnarr4 = new int[] { 1 };
        assertArrayEquals(lnarr4, toArray(rnnfl.removeNthFromEndList(ln4, 1)));
    }

    @Test
    public void removeLastItemInList() {
        System.out.println("Test ln2");
        int[] lnarr2 = new int[] { 1, 2, 4 };
        assertArrayEquals(lnarr2, toArray(rnnfl.removeNthFromEndList(ln2, 1)));
    }
}