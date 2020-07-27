package leetcode.page0.p041;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void firstMissingPositive() {
        Solution s = new Solution();
        int i = s.firstMissingPositive(new int[]{1, 2, 0});
        assertEquals(3, i);
        assertEquals(4, s.firstMissingPositive(new int[]{1,2,3}));
        assertEquals(4, s.firstMissingPositive(new int[]{2,3,1}));
        assertEquals(2, s.firstMissingPositive(new int[]{0,3,1}));
        assertEquals(2, s.firstMissingPositive(new int[]{3,4,-1,1}));
        assertEquals(1, s.firstMissingPositive(new int[]{7,8,9,10}));
    }
}