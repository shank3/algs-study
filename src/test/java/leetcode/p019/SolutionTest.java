package leetcode.p019;

import leetcode.ListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);

        Solution s = new Solution();
        ListNode node = s.removeNthFromEnd(list, 2);
        assertEquals(1, node.val);
        assertEquals(3, node.next.val);

    }
}