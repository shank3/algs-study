package leetcode.page5.p560;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySum() {
        Solution s = new Solution();
        assertEquals(2, s.subarraySum(new int[]{1,1,1}, 2));
    }
}