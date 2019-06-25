package leetcode.page0.p039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39.组合总和
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listAll = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(candidates, target, listAll, 0, new ArrayList<Integer>());
        return listAll;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> listAll, int i, ArrayList<Integer> tmp) {
        if (target == 0) {
            listAll.add(tmp);
            return;
        }
        for (int j = i; j < candidates.length && candidates[j] <= target; j++) {
            ArrayList<Integer> list = new ArrayList<Integer>(tmp);
            list.add(candidates[j]);
            backtrack(candidates, target - candidates[j], listAll, j, list);
        }
    }

}
