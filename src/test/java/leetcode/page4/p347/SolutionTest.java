package leetcode.page4.p347;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void topKFrequent() {
        Solution s = new Solution();
        List<Integer> list = s.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0).intValue());
        assertEquals(2, list.get(1).intValue());
    }
}