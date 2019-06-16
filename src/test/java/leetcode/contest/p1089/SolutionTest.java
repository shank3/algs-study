package leetcode.contest.p1089;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void duplicateZeros() {
        Solution s = new Solution();
        int[] a = {1,5,2,0,6,8,0,6,0};
        int[] e = {1,5,2,0,0,6,8,0,0};
        s.duplicateZeros(a);

        assertArrayEquals(e, a);

        s.duplicateZeros(new int[]{0,0,0,0,0});
    }
}