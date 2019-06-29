package leetcode.page4.p494;

/**
 * 494.目标和
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }
        int w = (sum + S) / 2;
        int[] dp = new int[w + 1];
        dp[0] = 1;
        for (int n : nums) {
            for (int i = w; i >= n; i--) {
                dp[i] += dp[i - n];
            }
        }
        return dp[w];
    }
}
