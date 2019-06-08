package leetcode.page1.p075;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortColors() {
        Solution s = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        s.sortColors(nums);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
        nums = new int[]{0,1,0};
        s.sortColors(nums);
        assertArrayEquals(new int[]{0,0,1}, nums);

    }
}