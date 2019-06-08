package leetcode.page1.p017;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void letterCombinations() {
        Solution s = new Solution();
        String[] exp = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        assertSame(Arrays.asList(exp).size(), s.letterCombinations("23").size());
    }
}