package leetcode.page1.p005;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        Solution s = new Solution();
        assertEquals("aba", s.longestPalindrome("babad"));
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }
}