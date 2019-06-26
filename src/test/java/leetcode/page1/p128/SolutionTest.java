package leetcode.page1.p128;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestConsecutive() {
        Solution s = new Solution();
        assertEquals(4, s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}