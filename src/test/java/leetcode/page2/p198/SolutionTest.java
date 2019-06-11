package leetcode.page2.p198;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rob() {
        Solution s = new Solution();
        assertEquals(4, s.rob(new int[]{1,2,3,1}));
        assertEquals(12, s.rob(new int[]{2,7,9,3,1}));
    }
}