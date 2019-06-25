package leetcode.page0.p032;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestValidParentheses() {
        Solution s = new Solution();
        assertEquals(2, s.longestValidParentheses(")())"));
        assertEquals(4, s.longestValidParentheses(")()())"));
        assertEquals(2, s.longestValidParentheses("()"));
        assertEquals(2, s.longestValidParentheses("())"));
    }
}