package leetcode.page1.p002;

import leetcode.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        Solution s = new Solution();
        //输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        //输出：7 -> 0 -> 8
        //原因：342 + 465 = 807
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);

        ListNode b = new ListNode(5);
        ListNode b2 = new ListNode(6);
        b.next = b2;
        b2.next = new ListNode(4);
        ListNode node = s.addTwoNumbers(a, b);
        assertEquals(7, node.val);
        assertEquals(0, node.next.val);
        assertEquals(8, node.next.next.val);

    }
}