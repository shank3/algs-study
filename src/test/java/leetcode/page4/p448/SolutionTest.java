package leetcode.page4.p448;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDisappearedNumbers() {
        Solution s = new Solution();
        List<Integer> list = s.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertEquals(2, list.size());
        assertEquals(5, list.get(0).intValue());
        assertEquals(6, list.get(1).intValue());
    }
}