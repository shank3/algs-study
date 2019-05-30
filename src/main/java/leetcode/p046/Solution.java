package leetcode.p046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 46.全排列
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> all = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        backtrack(all, list, nums.length, 0);
        return all;
    }

    private void backtrack(List<List<Integer>> all, List<Integer> list, int length, int cur) {
        System.out.println(list);
        if (cur == length) {
            all.add(new ArrayList<Integer>(list));
        }
        for (int i = cur; i < length; i++) {
            Collections.swap(list, i, cur);
            backtrack(all, list, length, cur + 1);
            Collections.swap(list, i, cur);
        }
    }

}
