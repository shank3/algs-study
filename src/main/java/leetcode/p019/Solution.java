package leetcode.p019;

/**
 * 19.删除链表的倒数第N个节点
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode fast = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            cur = cur.next;
            fast = fast.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}
