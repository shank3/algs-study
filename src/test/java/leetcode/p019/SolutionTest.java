package leetcode.p019;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        Solution.ListNode list = new Solution.ListNode(1);
        list.next = new Solution.ListNode(2);
        list.next.next = new Solution.ListNode(3);

        Solution s = new Solution();
        Solution.ListNode node = s.removeNthFromEnd(list, 2);
        assertEquals(1, node.val);
        assertEquals(3, node.next.val);

    }
}