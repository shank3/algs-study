package leetcode.page2.p300;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void lengthOfLIS() {
        Solution s = new Solution();
        assertEquals(4, s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}