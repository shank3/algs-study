package leetcode.page1.p143;

import leetcode.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reorderList() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 5; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        ListNode x = head;
        System.out.println(x.print());
//        ListNode y = head;
//        System.out.println(y.print());



        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
        assertEquals("1 -> 4 -> 2 -> 3", print);
    }


    @Test
    public void reorderList2() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 6; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head.print());
        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
        assertEquals("1 -> 5 -> 2 -> 4 -> 3", print);
    }

    @Test
    public void reorderList3() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 4; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head.print());
        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
        assertEquals("1 -> 3 -> 2", print);
    }

    @Test
    public void reorderList4() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 8; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head.print());
        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
        assertEquals("1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4", print);
    }

    @Test
    public void reorderList5() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 9; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head.print());
        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
        assertEquals("1 -> 8 -> 2 -> 7 -> 3 -> 6 -> 4 -> 5", print);
    }

    @Test
    public void reorderList6() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i < 20; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(head.print());
        Solution s = new Solution();
        s.reorderList(head);
        String print = head.print();
        System.out.println(print);
    }


}