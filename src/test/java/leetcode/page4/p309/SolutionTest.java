package leetcode.page4.p309;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        Solution s = new Solution();
        assertEquals(3, s.maxProfit(new int[]{1,2,3,0,2}));
    }
}