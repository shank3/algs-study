package leetcode.page6.p647;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countSubstrings() {
        Solution s = new Solution();
        assertEquals(3, s.countSubstrings("abc"));
        assertEquals(6, s.countSubstrings("aaa"));
    }
}