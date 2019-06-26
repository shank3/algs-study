package leetcode.page0.p020;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValid() {
        Solution s = new Solution();
        assertTrue(s.isValid("()"));
        assertTrue(s.isValid("()[]{}"));
        assertTrue(s.isValid("([]){}"));
        assertTrue(s.isValid("([{}])"));
        assertFalse(s.isValid("([)]"));
        assertFalse(s.isValid("(])"));
    }
}