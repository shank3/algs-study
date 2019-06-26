package leetcode.page3.p309;

/**
 * 309.最佳买卖股票时机含冷冻期
 */
public class Solution {
    public int maxProfit(int[] prices) {
        //第i天不持有股票
        int dp_i_0 = 0;
        //第i天持有股票
        int dp_i_1 = Integer.MIN_VALUE;
        //前天不持有股票
        int dp_pre_0 = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, dp_pre_0 - prices[i]);
            dp_pre_0 = temp;
        }
        return dp_i_0;
    }
}
