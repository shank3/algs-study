package leetcode.p070;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void climbStairs() {
        Solution s = new Solution();
        assertEquals(3, s.climbStairs(3));
        assertEquals(5, s.climbStairs(4));
    }
}