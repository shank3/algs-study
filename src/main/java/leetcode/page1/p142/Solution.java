package leetcode.page1.p142;

import leetcode.ListNode;

/**
 * 142.环形链表Ⅱ
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle) {
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }
}
