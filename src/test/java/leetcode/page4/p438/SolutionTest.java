package leetcode.page4.p438;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findAnagrams() {
        Solution s = new Solution();
        List<Integer> anagrams = s.findAnagrams("cbaebabacd", "abc");
        assertEquals(2, anagrams.size());
        assertEquals(0, anagrams.get(0).intValue());
        assertEquals(6, anagrams.get(1).intValue());
    }
}