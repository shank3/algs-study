package leetcode.page3.p279;

/**
 * 279.完全平方数
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j*j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}
