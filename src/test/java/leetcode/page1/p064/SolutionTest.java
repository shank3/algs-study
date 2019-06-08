package leetcode.page1.p064;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minPathSum() {
        Solution s = new Solution();
        int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
        assertEquals(7, s.minPathSum(grid));
    }
}