package leetcode.page0.p042;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void trap() {
        Solution s = new Solution();
        assertEquals(6, s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}