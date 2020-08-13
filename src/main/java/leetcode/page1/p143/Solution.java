package leetcode.page1.p143;

import leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //反转后半段
        ListNode cur = slow.next;
        slow.next = null;
        ListNode pre = cur;
        cur = cur.next;
        pre.next = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        //merge
        ListNode left = head,right = pre;
        System.out.println(left.print());
        System.out.println(right.print());

        while (left != null && right != null) {
            ListNode p2 = right.next;
            right.next = left.next;
            left.next = right;
            left = right.next;
            right = p2;
        }
        if (right != null) {
            ListNode x = head;
            while (x.next != null) {
                x = x.next;
            }
            x.next = right;
        }
    }
}