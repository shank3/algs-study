package leetcode.page0.p028;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void strStr() {
        Solution s = new Solution();
        assertEquals(2, s.strStr("hello", "ll"));
        assertEquals(-1, s.strStr("aaaa", "bba" ));
    }
}