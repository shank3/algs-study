package leetcode.page1.p046;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void permute() {
        Solution s = new Solution();
        List<List<Integer>> lists = s.permute(new int[]{1, 2, 3});
        System.out.println(lists);
    }
}