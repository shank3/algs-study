package leetcode.page5.p581;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findUnsortedSubarray() {
        Solution s = new Solution();
        assertEquals(5, s.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
        assertEquals(0, s.findUnsortedSubarray(new int[]{1, 2, 3}));
    }
}