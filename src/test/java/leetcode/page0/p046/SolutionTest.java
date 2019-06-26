package leetcode.page0.p046;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void permute() {
        Solution s = new Solution();
        List<List<Integer>> lists = s.permute(new int[]{1, 2, 3});
//        System.out.println(lists);
        assertEquals(6, lists.size());
    }
}