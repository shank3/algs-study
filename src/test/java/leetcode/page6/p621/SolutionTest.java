package leetcode.page6.p621;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void leastInterval() {
        Solution s = new Solution();
        assertEquals(8, s.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}