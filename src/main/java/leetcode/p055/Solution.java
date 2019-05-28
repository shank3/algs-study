package leetcode.p055;

/**
 * 55.跳跃游戏
 */
public class Solution {
    public boolean canJump(int[] nums) {
        return canJumpFrom(0, nums);
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
