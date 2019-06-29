package leetcode.page5.p581;

/**
 * 581.最短无序连续子数组
 */
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int m = nums[0], n = nums[len - 1];
        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            m = Math.max(m, nums[i]);
            if (m != nums[i]) {
                left = i;
            }
            n = Math.min(n, nums[len - 1 - i]);
            if (n != nums[len - 1 - i]) {
                right = len - 1 - i;
            }
        }
        return left == right ? 0 : left - right + 1;

    }
}
