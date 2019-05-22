package leetcode.p007;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        Solution s = new Solution();
        assertEquals(321, s.reverse(123));
        assertEquals(-321, s.reverse(-123));
        assertEquals(21, s.reverse(120));
        assertEquals(21, s.reverse(1200));
        assertEquals(201, s.reverse(10200));
        assertEquals(0, s.reverse(Integer.MAX_VALUE));
        assertEquals(0, s.reverse(Integer.MIN_VALUE));
    }
}