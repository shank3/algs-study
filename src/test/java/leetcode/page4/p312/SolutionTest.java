package leetcode.page4.p312;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxCoins() {
        Solution s = new Solution();
        assertEquals(167, s.maxCoins(new int[]{3,1,5,8}));
    }
}