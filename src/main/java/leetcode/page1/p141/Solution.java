package leetcode.page1.p141;

import leetcode.ListNode;

/**
 * 141.环形链表
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean cycle = false;
        if (head == null || head.next == null) {
            return cycle;
        }
        ListNode slow = head,fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return cycle;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return !cycle;
    }
}
