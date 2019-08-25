package leetcode.page0.p016;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSumClosest() {
        Solution s = new Solution();
        int[] a = new int[]{-1, 2, 1, -4};
        assertEquals(2, s.threeSumClosest(a, 1));

    }
}