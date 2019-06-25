package leetcode.page0.p011;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        Solution s = new Solution();
        assertEquals(49, s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}