package leetcode.p033;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void search() {
        Solution s = new Solution();
        assertEquals(4, s.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, s.search(new int[]{4,5,6,7,0,1,2}, 3));
    }
}