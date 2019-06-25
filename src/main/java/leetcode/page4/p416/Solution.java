package leetcode.page4.p416;

/**
 * 416.分割等和子集
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if ((sum & 1) == 1) {
            //和为奇数
            return false;
        }
        //右移1位，除2
        sum >>= 1;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
            if (dp[sum]) {
                return true;
            }
        }
        return dp[sum];
    }
}
