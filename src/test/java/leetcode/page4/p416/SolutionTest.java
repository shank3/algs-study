package leetcode.page4.p416;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canPartition() {
        Solution s = new Solution();
        assertTrue(s.canPartition(new int[]{1, 5, 11, 5}));
        assertFalse(s.canPartition(new int[]{1, 2, 3, 5}));
    }
}