package leetcode.page2.p152;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxProduct() {
        Solution s = new Solution();
        assertEquals(0, s.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(6, s.maxProduct(new int[]{2, 3, -2, 4}));
    }
}