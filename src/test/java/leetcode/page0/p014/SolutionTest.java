package leetcode.page0.p014;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution s = new Solution();
        assertEquals("fl", s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("", s.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}