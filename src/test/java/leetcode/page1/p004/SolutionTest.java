package leetcode.page1.p004;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        Solution s = new Solution();
        assertTrue(2.0 == s.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        assertTrue(2.5 == s.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));

    }
}