package leetcode.page0.p076;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minWindow() {
        Solution s = new Solution();
        assertEquals("BANC", s.minWindow("ADOBECODEBANC", "ABC"));
    }
}