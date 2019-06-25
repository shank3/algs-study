package leetcode.page2.p238;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void productExceptSelf() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{24,12,8,6}, s.productExceptSelf(new int[]{1,2,3,4}));
    }
}