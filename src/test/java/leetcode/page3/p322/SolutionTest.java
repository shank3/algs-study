package leetcode.page3.p322;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void coinChange() {
        Solution s = new Solution();
        assertEquals(3, s.coinChange(new int[]{1,2,5}, 11));
        assertEquals(-1, s.coinChange(new int[]{2}, 3));
    }
}