package leetcode.page3.p392;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isSubsequence() {
        Solution s = new Solution();
        assertTrue(s.isSubsequence("abc", "ahbgdc"));
        assertFalse(s.isSubsequence("axc", "asdfvc"));
    }
}