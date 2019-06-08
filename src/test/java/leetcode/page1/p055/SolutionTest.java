package leetcode.page1.p055;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canJump() {
        Solution s = new Solution();
        assertTrue(s.canJump(new int[]{2,3,1,1,4}));
        assertFalse(s.canJump(new int[]{3,2,1,0,4}));
    }
}