package leetcode.page2.p221;

/**
 * 221.矩阵中的最大正方形
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int x = matrix.length;
        if (x < 1) return 0;
        int max = 0, y = matrix[0].length;
        int[][] dp = new int[x+1][y+1];
        for (int i = 1; i <= x; ++i) {
            for (int j = 1; j <= y; ++j) {
                if (matrix[i-1][j-1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }
}
