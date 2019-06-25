package leetcode.page1.p128;

import java.util.HashSet;
import java.util.Set;

/**
 * 128.最长连续子序列
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;
        for (Integer n : set) {
            if (!set.contains(n-1)) {
                int num = n;
                int len = 1;
                while (set.contains(num + 1)) {
                    len++;
                    num++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
