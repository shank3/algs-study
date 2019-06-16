package leetcode.page3.p234;

import leetcode.ListNode;

/**
 * 234.回文链表
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        //reverse right
        ListNode prve = null;
        mid = mid.next;
        while (mid != null) {
            ListNode t = mid.next;
            mid.next = prve;
            prve = mid;
            mid = t;
        }
        ListNode tail = prve;
        while (head != null && tail != null) {
            if (head.val != tail.val) {
                return false;
            } else {
                head = head.next;
                tail = tail.next;
            }
        }
        return true;
    }
}
