package leetcode.page0.p029;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void divide() {
        Solution s = new Solution();
        assertEquals(3, s.divide(10, 3));
        assertEquals(-2, s.divide(7, -3));
    }
}