package leetcode.page7.p739;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void dailyTemperatures() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}