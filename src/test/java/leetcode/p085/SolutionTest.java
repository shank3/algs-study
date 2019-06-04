package leetcode.p085;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalRectangle() {
        Solution s = new Solution();
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        assertEquals(6, s.maximalRectangle(matrix));
    }
}