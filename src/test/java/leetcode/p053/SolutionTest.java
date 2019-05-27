package leetcode.p053;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxSubArray() {
        Solution s = new Solution();
        assertEquals(6, s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}