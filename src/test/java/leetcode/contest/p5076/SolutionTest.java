package leetcode.contest.p5076;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void gcdOfStrings() {
        Solution s = new Solution();
        assertEquals("ABC", s.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", s.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", s.gcdOfStrings("LEET", "CODE"));
        assertEquals("TAUXX", s.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}