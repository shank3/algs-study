package leetcode.page1.p121;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProfit() {
        Solution s = new Solution();
        assertEquals(5, s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}