package leetcode.page2.p169;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void majorityElement() {
        Solution s = new Solution();
        assertEquals(3, s.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, s.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}