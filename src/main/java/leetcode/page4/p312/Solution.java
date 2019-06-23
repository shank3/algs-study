package leetcode.page4.p312;

import java.util.Arrays;
import java.util.Collections;

/**
 * 312.戳气球
 */
public class Solution {

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0] = arr[n+1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i+1] = nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for (int i = 2; i < arr.length; i++) {
            for (int j = 0; j + i < arr.length; j++) {
                for (int k = j+1; k < j+i; k++) {
                    dp[j][j+i] = Math.max(dp[j][j+i], dp[j][k] + dp[k][j+i] +
                            arr[j] * arr[k] * arr[j+i]);
                }
            }
        }
        return dp[0][n+1];
    }
}
