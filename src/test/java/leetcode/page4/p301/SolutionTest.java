package leetcode.page4.p301;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeInvalidParentheses() {
        Solution s = new Solution();
        assertEquals(2, s.removeInvalidParentheses("()())()").size());
        assertEquals(2, s.removeInvalidParentheses("(a)())()").size());
        assertEquals(1, s.removeInvalidParentheses(")(").size());
    }
}