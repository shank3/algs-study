package leetcode.p078;

import java.util.ArrayList;
import java.util.List;

/**
 * 78.子集
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        int size = nums.length;
        for (int i = 0; i < (1 << size); i++) {
            List<Integer> in = new ArrayList<Integer>();
            for (int j = 0; j < size; j++) {
                if ((i & (1<<j)) != 0) {
                    in.add(nums[j]);
                }

            }
//            System.out.println(in);
            out.add(in);
        }
        return out;
    }
}
