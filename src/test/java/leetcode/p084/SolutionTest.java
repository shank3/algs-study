package leetcode.p084;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestRectangleArea() {
        Solution s = new Solution();
        assertEquals(10, s.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}