package leetcode.p046;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void permute() {
        Solution s = new Solution();
        List<List<Integer>> lists = s.permute(new int[]{1, 2, 3});
        System.out.println(lists);
    }
}