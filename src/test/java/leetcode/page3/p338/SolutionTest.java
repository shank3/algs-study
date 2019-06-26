package leetcode.page3.p338;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countBits() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{0,1,1,2,1,2}, s.countBits(5));
    }
}