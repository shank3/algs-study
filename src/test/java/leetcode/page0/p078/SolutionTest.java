package leetcode.page0.p078;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subsets() {
        Solution s = new Solution();
        List<List<Integer>> subsets = s.subsets(new int[]{1, 2, 3});
        assertEquals(8, subsets.size());
    }
}