package leetcode.p008;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void myAtoi() {
        Solution s = new Solution();
        assertEquals(0, s.myAtoi("0"));
        assertEquals(2147483647, s.myAtoi(Integer.MAX_VALUE + ""));
        assertEquals(2147483646, s.myAtoi(Integer.MAX_VALUE - 1 + ""));
        assertEquals(-2147483648, s.myAtoi(Integer.MIN_VALUE + ""));
        assertEquals(-2147483647, s.myAtoi(Integer.MIN_VALUE  + 1 + ""));
        assertEquals(2147483647, s.myAtoi("2147483648"));
        assertEquals(-42, s.myAtoi("    -42"));
        assertEquals(4193, s.myAtoi("4193 with words"));
        assertEquals(0, s.myAtoi("words and 987"));
        assertEquals(Integer.MIN_VALUE, s.myAtoi("-91283472332"));
        assertEquals(0, s.myAtoi("+-2"));
        assertEquals(0, s.myAtoi("-+2"));
    }
}