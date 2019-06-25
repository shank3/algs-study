package leetcode.page0.p034;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchRange() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{3, 4}, s.searchRange(new int[]{5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[]{-1, -1}, s.searchRange(new int[]{5,7,7,8,8,10}, 6));
        assertArrayEquals(new int[]{2,5}, s.searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3));
    }
}