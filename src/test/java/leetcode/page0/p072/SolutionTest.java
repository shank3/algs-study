package leetcode.page0.p072;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minDistance() {
        Solution s = new Solution();
        assertEquals(3, s.minDistance("horse", "ros"));
        assertEquals(5, s.minDistance("intention", "exeuction"));
    }
}