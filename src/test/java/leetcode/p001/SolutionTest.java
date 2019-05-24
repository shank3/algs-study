package leetcode.p001;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        //[2, 7, 11, 15], target = 9
        Solution s = new Solution();
        assertArrayEquals(new int[]{0, 1}, s.twoSum(new int[]{2,7,11,15}, 9));
    }
}