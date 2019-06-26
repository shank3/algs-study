package leetcode.page2.p287;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDuplicate() {
        Solution s = new Solution();
        assertEquals(2, s.findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, s.findDuplicate(new int[]{1,3,4,2,3}));

    }
}