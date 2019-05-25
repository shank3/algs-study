package leetcode.p015;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSum() {
        Solution s = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = s.threeSum(nums);

        assertEquals(2, lists.size());
        int[] s1 = new int[3];
        for (int i = 0; i < 3; i++) {
            s1[i] = lists.get(0).get(i);
        }
        assertArrayEquals(new int[] {-1, -1, 2}, s1);

        int[] s2 = new int[3];
        for (int i = 0; i < 3; i++) {
            s2[i] = lists.get(1).get(i);
        }
        assertArrayEquals(new int[] {-1, 0, 1}, s2);

    }
}