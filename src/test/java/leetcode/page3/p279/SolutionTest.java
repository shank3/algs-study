package leetcode.page3.p279;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numSquares() {
        Solution s = new Solution();
        assertEquals(3, s.numSquares(12));
        assertEquals(2, s.numSquares(13));
    }
}