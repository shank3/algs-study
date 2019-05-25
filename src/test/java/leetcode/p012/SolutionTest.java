package leetcode.p012;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void intToRoman() {
        Solution s =  new Solution();
        assertEquals("III", s.intToRoman(3));
        assertEquals("IV", s.intToRoman(4));
        assertEquals("IX", s.intToRoman(9));
        assertEquals("LVIII", s.intToRoman(58));
        assertEquals("MCMXCIV", s.intToRoman(1994));
    }
}