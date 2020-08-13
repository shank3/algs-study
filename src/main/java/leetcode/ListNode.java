package leetcode;

/**
 * 单链表，多个题目用到
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String print() {
        String s = val + " -> ";
        ListNode n = next;
        while (n != null) {
            s += n.val + (n.next == null ? "" : " -> ");
            n = n.next;
        }
        return s;
    }
}
