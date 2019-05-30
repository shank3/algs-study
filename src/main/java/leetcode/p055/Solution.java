package leetcode.p055;

/**
 * 55.跳跃游戏
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int last = n - 1;
        for (int i = last; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
//        return canJumpFrom(0, nums);
    }

    private boolean canJumpFrom(int pos, int[] nums) {
        if (pos == nums.length - 1) {
            return true;
        }
        int max = nums[pos] + pos < nums.length ? nums[pos] + pos : nums.length - 1;
        for (int i = pos+1; i <= max; i++) {
            if (canJumpFrom(i, nums)) {
                return true;
            }
        }
        return false;
    }




}
