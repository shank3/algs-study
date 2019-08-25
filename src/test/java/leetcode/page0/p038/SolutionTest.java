package leetcode.page0.p038;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countAndSay() {
        Solution s = new Solution();
        assertEquals("11", s.countAndSay(2));
        assertEquals("111221", s.countAndSay(5));
        assertEquals("13211311123113112211", s.countAndSay(10));
    }
}