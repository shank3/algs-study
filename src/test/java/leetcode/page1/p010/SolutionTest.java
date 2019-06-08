package leetcode.page1.p010;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isMatch() {
        Solution s = new Solution();
        assertFalse(s.isMatch("aa", "a"));
        assertTrue(s.isMatch("aa", "a*"));
        assertTrue(s.isMatch("ab", ".*"));
        assertTrue(s.isMatch("aab", "c*a*b"));
        assertFalse(s.isMatch("mississippi", "miss*is*p"));
        assertTrue(s.isMatch("mississippi", "mis*is*ip*."));
    }


    @Test
    public void isMatch2() {
        Solution s = new Solution();
        assertFalse(s.isMatch2("aa", "a"));
        assertTrue(s.isMatch2("aa", "a*"));
        assertTrue(s.isMatch2("ab", ".*"));
        assertTrue(s.isMatch2("aab", "c*a*b"));
        assertFalse(s.isMatch2("mississippi", "miss*is*p"));
        assertTrue(s.isMatch2("mississippi", "mis*is*ip*."));
    }
}