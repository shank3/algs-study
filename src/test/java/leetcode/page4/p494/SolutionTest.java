package leetcode.page4.p494;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findTargetSumWays() {
        Solution s = new Solution();
        assertEquals(5, s.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
    }
}