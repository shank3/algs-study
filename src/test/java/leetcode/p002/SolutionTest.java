package leetcode.p002;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addTwoNumbers() {
        Solution s = new Solution();
        //输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        //输出：7 -> 0 -> 8
        //原因：342 + 465 = 807
        Solution.ListNode a = new Solution.ListNode(2);
        a.next = new Solution.ListNode(4);
        a.next.next = new Solution.ListNode(3);

        Solution.ListNode b = new Solution.ListNode(5);
        Solution.ListNode b2 = new Solution.ListNode(6);
        b.next = b2;
        b2.next = new Solution.ListNode(4);
        Solution.ListNode node = s.addTwoNumbers(a, b);
        assertEquals(7, node.val);
        assertEquals(0, node.next.val);
        assertEquals(8, node.next.next.val);

    }
}