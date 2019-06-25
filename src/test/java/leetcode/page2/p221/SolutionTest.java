package leetcode.page2.p221;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalSquare() {
        Solution s = new Solution();
        assertEquals(0, s.maximalSquare(new char[][]{}));

        char[][] m = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, s.maximalSquare(m));

        assertEquals(1, s.maximalSquare(new char[][]{{'1'}}));
    }
}