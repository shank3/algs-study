package leetcode.page0.p009;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution s = new Solution();
        assertFalse(s.isPalindrome(-12));
        assertTrue(s.isPalindrome(1));
        assertTrue(s.isPalindrome(0));
        assertTrue(s.isPalindrome(121));
        assertTrue(s.isPalindrome(1221));
    }
}