package leetcode.p001;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0,j = 0;
        int len = nums.length;
        flag:
        for (i = 0; i < len-1; i++) {
            for (j = i+1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    break flag;
                }
            }
        }
        return new int[]{i, j};
    }
}
