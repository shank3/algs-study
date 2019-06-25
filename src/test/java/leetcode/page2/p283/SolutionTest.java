package leetcode.page2.p283;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void moveZeroes() {
        Solution s = new Solution();
        int[] a = {0,1,0,3,12};
        s.moveZeroes(a);
        assertArrayEquals(new int[]{1,3,12,0,0}, a);
    }
}